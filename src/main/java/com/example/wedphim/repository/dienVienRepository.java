package com.example.wedphim.repository;

import com.example.wedphim.controller.admin.entity.dienVien;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface dienVienRepository  extends JpaRepository<dienVien, Long> {
}
