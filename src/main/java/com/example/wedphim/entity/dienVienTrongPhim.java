//package com.example.wedphim.entity;
//
//import jakarta.persistence.*;
//import lombok.Data;
//
//import java.util.List;
//
//@Data
//@Entity
//@Table(name="dienVienTrongPhim")
//public class dienVienTrongPhim {
//    @EmbeddedId
//    private Long id;
//
//    @ManyToOne(fetch = FetchType.LAZY, optional = false)
//    @MapsId("dienVien_id")
//    @JoinColumn(name = "dienVien_id")
//    private dienVien DienVien;
//    @ManyToOne(fetch = FetchType.LAZY, optional = false)
//    @MapsId("phim_id")
//    @JoinColumn(name = "phim_id")
//    private phim Phim;
//}