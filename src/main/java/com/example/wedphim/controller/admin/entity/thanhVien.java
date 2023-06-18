package com.example.wedphim.controller.admin.entity;

import jakarta.persistence.*;

import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.Data;

import java.util.Date;

@Data
@Entity
@Table(name = "thanhVien")
public class thanhVien {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column
    private Long id;
    @Column
    @NotNull
    @Size(min = 6,max = 50)
    private String username;
    @Column
    @NotNull
    @Size(min = 6,max = 50)
    private String password;
    @Column
    @NotNull
    @Size(min = 1,max = 100)
    private String hoTen;
    @Column
    @NotNull
    @Size(min = 1,max = 200)
    private String diaChi;
    @Column
    @NotNull
    @Size(min = 10,max = 10)
    private String sdt;
    @Column
    @NotNull
    @Size(min = 1,max = 200)
    private String email;
    @Column
    @NotNull
    private Date ngaySinh;



}
