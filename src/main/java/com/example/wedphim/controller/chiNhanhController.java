package com.example.wedphim.controller;

import com.example.wedphim.entity.chiNhanh;
import com.example.wedphim.service.chiNhanhService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequestMapping("/chinhanhh")
public class chiNhanhController {
    @Autowired
    private chiNhanhService chinhanhService;

    @GetMapping
    public String showAllchiNhanh(Model model)
    {
        List<chiNhanh> chinhanhs = chinhanhService.getAllchiNhanhs();
        model.addAttribute("chinhanhs",chinhanhs);
        model.addAttribute("name","chinhanhs");
        return "chinhanhh/list";
    }

    @GetMapping("/add")
    public String addchiNhanhForm(Model model){
        model.addAttribute("chinhanh",new chiNhanh());
        return "chinhanhh/add";
    }


    @PostMapping("/add")
    public String addchiNhanh(@Valid @ModelAttribute("chinhanh") chiNhanh chinhanh , BindingResult bindingResult , Model model){
        if(bindingResult.hasErrors())
        {

            return "chinhanhh/add";
        }
        chinhanhService.createchiNhanh(chinhanh);
        return "redirect:/phongg";
    }

    @GetMapping("/edit/{id}")
    public String editPhongForm(@PathVariable("id") long id, Model model){
        chiNhanh editCate = chinhanhService.getchiNhanhById(id);
        if(editCate != null){
            model.addAttribute("chinhanh", editCate);
            return "chinhanhh/edit";
        }else {
            return "not-found";
        }
    }
    @PostMapping("/edit")
    public String editPhong(@Valid @ModelAttribute("chinhanh")chiNhanh updateCate, BindingResult bindingResult, Model model ){
        if (bindingResult.hasErrors()){
            model.addAttribute("chinhanh", chinhanhService.getAllchiNhanhs());
            return "chinhanhh/edit";
        }
        chinhanhService.getAllchiNhanhs().stream()
                .filter(chinhanh -> chinhanh.getId() == updateCate.getId())
                .findFirst()
                .ifPresent(chinhanh -> {

                    chinhanhService.updatechiNhanh(chinhanh);
                });
        return "redirect:/chinhanhh";
    }
    @PostMapping("/delete/{id}")
    public String deletePhong(@PathVariable("id") long id){
        chinhanhService.deletechiNhanh(id);
        return "redirect:/chinhanhh";
    }
}
