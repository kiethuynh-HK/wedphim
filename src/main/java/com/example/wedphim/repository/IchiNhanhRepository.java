package com.example.wedphim.repository;


import com.example.wedphim.entity.chiNhanh;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IchiNhanhRepository extends JpaRepository<chiNhanh,Long> {
}
