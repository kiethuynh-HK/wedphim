package com.example.wedphim.controller;



import com.example.wedphim.controller.admin.entity.phong;
import com.example.wedphim.service.PhongService;
import com.example.wedphim.service.chiNhanhService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@Controller
@RequestMapping("/phongg")
public class PhongController {
    @Autowired
    private PhongService phongService;
    @Autowired
    private chiNhanhService chinhanhService;

    @GetMapping
    public String showAllPhongs(Model model)
    {
        List<phong> phong = phongService.getAllPhongs();
        model.addAttribute("phong",phong);
        model.addAttribute("name","phong");
        return "phongg/list";
    }


    @GetMapping("/add")
    public String addPhongForm(Model model){
        model.addAttribute("phong",new phong());
        model.addAttribute("chinhanhs",chinhanhService.getAllchiNhanhs());
        return "phongg/add";
    }


    @PostMapping("/add")
    public String addPhong(@Valid @ModelAttribute("phong") phong Phong , BindingResult bindingResult , Model model){
        if(bindingResult.hasErrors())
        {
            model.addAttribute("chinhanhs",chinhanhService.getAllchiNhanhs());
            return "phongg/add";
        }
        phongService.addPhong(Phong);
        return "redirect:/phongg";
    }
    @GetMapping("/edit/{id}")
    public String editPhongForm(@PathVariable("id") long id, Model model){
        phong editPhong = phongService.getPhongById(id);
        if(editPhong != null){
            model.addAttribute("phong", editPhong);
            model.addAttribute("chinhanhs", chinhanhService.getAllchiNhanhs());
            return "phongg/edit";
        }else {
            return "not-found";
        }
    }
    @PostMapping("/edit")
    public String editPhong(@Valid @ModelAttribute("phong")phong updatePhong, BindingResult bindingResult, Model model ){
        if (bindingResult.hasErrors()){
            model.addAttribute("chinhanhs", chinhanhService.getAllchiNhanhs());
            return "phongg/edit";
        }
        phongService.getAllPhongs().stream()
                .filter(phong-> phong.getId() == updatePhong.getId())
                .findFirst()
                .ifPresent(phong -> {

                    phongService.updatePhong(updatePhong);
                });
        return "redirect:/phongg";
    }
    @PostMapping("/delete/{id}")
    public String deletePhong(@PathVariable("id") long id){
        phongService.deletePhong(id);
        return "redirect:/phongg";
    }
}
