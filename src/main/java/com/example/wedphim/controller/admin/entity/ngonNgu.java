package com.example.wedphim.controller.admin.entity;

import jakarta.persistence.*;
import lombok.Data;

import java.util.List;

@Data
@Entity
@Table
public class ngonNgu {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name="ngonNgu")
    private String ngonNgu;
    @OneToMany(mappedBy = "ngonNgus" , fetch = FetchType.LAZY)
    private List<phim> listPhim;
}
