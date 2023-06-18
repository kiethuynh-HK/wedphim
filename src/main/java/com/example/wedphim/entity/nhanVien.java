//package com.example.wedphim.entity;
//
//import jakarta.persistence.*;
//import lombok.Data;
//
//@Data
//@Entity
//@Table(name = "nhanVien")
//public class nhanVien {
//    @Id
//    @GeneratedValue(strategy = GenerationType.IDENTITY)
//    private Long id;
//    @Column
//    private float heSoLuong;
//    @ManyToOne(fetch = FetchType.LAZY)
//    @JoinColumn(name="role_id")
//    private role roles;
//}