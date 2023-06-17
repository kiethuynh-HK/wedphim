package com.example.wedphim.repository;

import com.example.wedphim.entity.Phong;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IPhongRepository extends JpaRepository<Phong,Long> {
}
