package com.example.wedphim.service;
import com.example.wedphim.controller.admin.entity.phim;

import com.example.wedphim.repository.phimRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class phimService {
    @Autowired
    private phimRepository phim_Rp;

    public List<phim> getAll() {
        return phim_Rp.findAll();
    }

    public void saveFilm(phim film) {
        phim_Rp.save(film);
    }

    public phim getFilmById(Long id) {
        return phim_Rp.findById(id).get();
    }

    public void deleteFilmId(Long id) {
        phim_Rp.deleteById(id);
    }
}
