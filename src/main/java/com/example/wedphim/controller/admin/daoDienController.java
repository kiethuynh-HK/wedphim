package com.example.wedphim.controller.admin;

import com.example.wedphim.controller.admin.entity.daoDien;
import com.example.wedphim.service.daoDienService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/admin/director")
public class daoDienController {
    @Autowired
    private daoDienService daoDien_Sv;

    @GetMapping
    public List<daoDien> getAllDirectors() {
        return daoDien_Sv.getAll();
    }

    @PostMapping
    public void saveDirector(@RequestBody daoDien director) {
        daoDien_Sv.saveDirector(director);
    }

    @GetMapping("/{id}")
    public daoDien getDirectorById(@PathVariable Long id) {
        return daoDien_Sv.getDirectorById(id);
    }

    @DeleteMapping("/{id}")
    public void deleteDirectorById(@PathVariable Long id) {
        daoDien_Sv.deleteDirectorById(id);
    }
}
