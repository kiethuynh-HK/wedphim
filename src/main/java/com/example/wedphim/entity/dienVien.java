package com.example.wedphim.entity;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;
import lombok.Data;

import java.util.List;

@Data
@Entity
@Table(name="dienVien")
public class dienVien {
    @Id
    @Column(name="id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name = "tenDienVien")
    @NotEmpty(message = "Ten dien vien khong duoc de trong")
    private String tenDienVien;
    @Column(name = "image")
    @NotNull
    private String image;
    @Column(name = "moTa")
    @NotEmpty(message = "Mo ta khong duoc de trong")
    private String moTa;

    @OneToMany(mappedBy = "dienVien", cascade = CascadeType.ALL)
    private List<dienVienTrongPhim> dienvien_tp;
}
