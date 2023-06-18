package com.example.wedphim.controller.admin;


import com.example.wedphim.controller.admin.entity.phim;
import com.example.wedphim.service.phimService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/admin/film")
public class phimController {
    @Autowired
    private phimService phim_Sv;

    @GetMapping
    public List<phim> getAllFilms() {
        return phim_Sv.getAll();
    }

    @PostMapping
    public void saveFilm(@RequestBody phim film) {
        phim_Sv.saveFilm(film);
    }

    @GetMapping("/{id}")
    public phim getFilmById(@PathVariable Long id) {
        return phim_Sv.getFilmById(id);
    }

    @DeleteMapping("/{id}")
    public void deleteFilmById(@PathVariable Long id) {
        phim_Sv.deleteFilmId(id);
    }
}
