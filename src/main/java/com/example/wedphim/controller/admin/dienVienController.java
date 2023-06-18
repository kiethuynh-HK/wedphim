package com.example.wedphim.controller.admin;

import com.example.wedphim.controller.admin.entity.dienVien;
import com.example.wedphim.service.dienVienService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/admin/actor")
public class dienVienController {
    @Autowired
    private dienVienService dienVien_Sv;

    @GetMapping
    public List<dienVien> getAllActors() {
        return dienVien_Sv.getAll();
    }

    @PostMapping
    public void saveActor(@RequestBody dienVien actor) {
        dienVien_Sv.saveActor(actor);
    }

    @GetMapping("/{id}")
    public dienVien getActorById(@PathVariable Long id) {
        return dienVien_Sv.getActorById(id);
    }

    @DeleteMapping("/{id}")
    public void deleteActorById(@PathVariable Long id) {
        dienVien_Sv.deleteActorById(id);
    }
}
