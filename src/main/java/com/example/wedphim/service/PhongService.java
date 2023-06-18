package com.example.wedphim.service;


import com.example.wedphim.controller.admin.entity.phong;
import com.example.wedphim.repository.IPhongRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
@Service
public class PhongService {
    @Autowired
    private IPhongRepository iphongRepository;

    public List<phong> getAllPhongs(){
        return iphongRepository.findAll();
    }
    public phong getPhongById(Long id){
        Optional<phong> optional = iphongRepository.findById(id);
        return optional.orElse(null);
    }
    public void addPhong(phong phong){
        iphongRepository.save(phong);
    }
    public void updatePhong(phong phong){
        iphongRepository.save(phong);
    }
    public void deletePhong(Long id){
        iphongRepository.deleteById(id);
    }
}
