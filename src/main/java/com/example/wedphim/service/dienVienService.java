package com.example.wedphim.service;

import com.example.wedphim.controller.admin.entity.dienVien;
import com.example.wedphim.repository.dienVienRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class dienVienService {

    @Autowired
    private dienVienRepository dienVien_Rp;

    public List<dienVien> getAll() {
        return dienVien_Rp.findAll();
    }

    public void saveActor(dienVien actor) {
        dienVien_Rp.save(actor);
    }

    public dienVien getActorById(Long id) {
        return dienVien_Rp.findById(id).get();
    }

    public void deleteActorById(Long id) {
        dienVien_Rp.deleteById(id);
    }

}