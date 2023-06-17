package com.example.wedphim.entity;

import jakarta.persistence.*;
import lombok.Data;

import java.util.List;

@Data
@Entity
@Table
public class ngonNgu {
    @Id
    @Column(name="id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name="ngonNgu")
    private String ngonNgu;
    @OneToMany(mappedBy = "ngonNgu" , fetch = FetchType.LAZY)
    private List<phim> listPhim;
}
