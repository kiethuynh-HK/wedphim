package com.example.wedphim.controller.admin.entity;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;
import lombok.Data;



import java.util.List;


@Data
@Entity
@Table(name="daoDien")
public class daoDien {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name = "tenDaoDien")
    @NotEmpty(message = "Ten dao dien khong duoc de trong")
    private String tenDaoDien;
    @Column(name = "image")
    @NotNull
    private String image;
    @Column(name = "moTa")
    @NotEmpty(message = "Mo ta khong duoc de trong")
    private String moTa;

    @OneToMany(mappedBy = "DaoDien", cascade = CascadeType.ALL)
    private List<daoDienTrongPhim> daodiens;
}
