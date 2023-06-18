package com.example.wedphim.repository;


import com.example.wedphim.controller.admin.entity.phim;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface phimRepository extends JpaRepository<phim, Long> {
}
