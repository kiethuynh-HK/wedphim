//package com.example.wedphim.service;
//
//import com.example.wedphim.controller.admin.entity.daoDien;
//import com.example.wedphim.repository.daoDienRepository;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Service;
//
//import java.util.List;
//@Service
//public class daoDienService {
//    @Autowired
//    private daoDienRepository daoDien_Rp;
//
//    public List<daoDien> getAll() {
//        return daoDien_Rp.findAll();
//    }
//
//    public void saveDirector(daoDien director) {
//        daoDien_Rp.save(director);
//    }
//
//    public daoDien getDirectorById(Long id) {
//        return daoDien_Rp.findById(id).get();
//    }
//
//    public void deleteDirectorById(Long id) {
//        daoDien_Rp.deleteById(id);
//    }
//}
