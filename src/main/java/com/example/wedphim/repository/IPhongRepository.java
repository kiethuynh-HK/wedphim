package com.example.wedphim.repository;


import com.example.wedphim.controller.admin.entity.phong;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IPhongRepository extends JpaRepository<phong,Long> {
}
