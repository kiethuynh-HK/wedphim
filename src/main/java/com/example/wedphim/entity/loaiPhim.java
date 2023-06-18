package com.example.wedphim.entity;
import jakarta.persistence.*;
import lombok.Data;

import java.util.List;

@Data
@Entity
@Table
public class loaiPhim {
    @Id
    @Column(name="id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name="tenLoai")
    private String tenLoai;
    @OneToMany(mappedBy = "loaiPhim" , fetch = FetchType.LAZY)
    private List<phim> listPhim;
}
