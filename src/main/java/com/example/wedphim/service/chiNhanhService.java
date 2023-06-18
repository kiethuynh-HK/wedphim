package com.example.wedphim.service;

import com.example.wedphim.entity.chiNhanh;
import com.example.wedphim.repository.IchiNhanhRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
@Service
public class chiNhanhService {
    @Autowired
    private IchiNhanhRepository ichiNhanhRepository;


    public List<chiNhanh> getAllchiNhanhs(){ return ichiNhanhRepository.findAll();}
    public chiNhanh getchiNhanhById(Long id)
    {
        Optional<chiNhanh> optionalCategory = ichiNhanhRepository.findById(id);
        if(optionalCategory.isPresent()){
            return optionalCategory.get();
        }else{
            throw new RuntimeException("chiNhanh not found");
        }
    }

    public chiNhanh savechiNhanh(chiNhanh chinhanh){ return ichiNhanhRepository.save(chinhanh);}
    public chiNhanh createchiNhanh(chiNhanh chinhanh){ return ichiNhanhRepository.save(chinhanh);}
    public  void  updatechiNhanh(chiNhanh chinhanh) { ichiNhanhRepository.save(chinhanh);}
    public void deletechiNhanh(Long id) { ichiNhanhRepository.deleteById(id);}

}
