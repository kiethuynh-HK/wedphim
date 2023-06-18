package com.example.wedphim.controller;


import com.example.wedphim.entity.Phong;
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
@RequestMapping("/phong")
public class PhongController {
    @Autowired
    private PhongService phongService;
    @Autowired
    private chiNhanhService chinhanhService;

    @GetMapping
    public String showAllPhongs(Model model)
    {
        List<Phong> phong = phongService.getAllPhongs();
        model.addAttribute("phong",phong);
        model.addAttribute("name","phong");
        return "phong/list";
    }


    @GetMapping("/add")
    public String addPhongForm(Model model){
        model.addAttribute("phong",new Phong());
        model.addAttribute("chinhanhs",chinhanhService.getAllchiNhanhs());
        return "phong/add";
    }


    @PostMapping("/add")
    public String addPhong(@Valid @ModelAttribute("phong") Phong phong , BindingResult bindingResult , Model model){
        if(bindingResult.hasErrors())
        {
            model.addAttribute("chinhanhs",chinhanhService.getAllchiNhanhs());
            return "phong/add";
        }
        phongService.addPhong(phong);
        return "redirect:/phong";
    }
    @GetMapping("/edit/{id}")
    public String editPhongForm(@PathVariable("id") long id, Model model){
        Phong editPhong = phongService.getPhongById(id);
        if(editPhong != null){
            model.addAttribute("phong", editPhong);
            model.addAttribute("chinhanhs", chinhanhService.getAllchiNhanhs());
            return "phong/edit";
        }else {
            return "not-found";
        }
    }
    @PostMapping("/edit")
    public String editPhong(@Valid @ModelAttribute("phong")Phong updatePhong, BindingResult bindingResult, Model model ){
        if (bindingResult.hasErrors()){
            model.addAttribute("chinhanhs", chinhanhService.getAllchiNhanhs());
            return "phong/edit";
        }
        phongService.getAllPhongs().stream()
                .filter(phong-> phong.getId() == updatePhong.getId())
                .findFirst()
                .ifPresent(phong -> {

                    phongService.updatePhong(updatePhong);
                });
        return "redirect:/phong";
    }
    @PostMapping("/delete/{id}")
    public String deletePhong(@PathVariable("id") long id){
        phongService.deletePhong(id);
        return "redirect:/phong";
    }
}
