package com.example.wedphim.repository;

import com.example.wedphim.controller.admin.entity.daoDien;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface daoDienRepository  extends JpaRepository<daoDien, Long> {

}
