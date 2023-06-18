package com.example.wedphim.service;



import com.example.wedphim.entity.Phong;
import com.example.wedphim.repository.IPhongRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
@Service
public class PhongService {
    @Autowired
    private IPhongRepository iphongRepository;

    public List<Phong> getAllPhongs(){
        return iphongRepository.findAll();
    }
    public Phong getPhongById(Long id){
        Optional<Phong> optional = iphongRepository.findById(id);
        return optional.orElse(null);
    }
    public void addPhong(Phong phong){
        iphongRepository.save(phong);
    }
    public void updatePhong(Phong phong){
        iphongRepository.save(phong);
    }
    public void deletePhong(Long id){
        iphongRepository.deleteById(id);
    }
}
