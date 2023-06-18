package com.example.wedphim.controller.admin.entity;
import jakarta.persistence.*;
import lombok.Data;

import java.util.List;

@Data
@Entity
@Table
public class loaiPhim {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name="tenLoai")
    private String tenLoai;
    @OneToMany(mappedBy = "loaiPhims" , fetch = FetchType.LAZY)
    private List<phim> listPhim;
}
