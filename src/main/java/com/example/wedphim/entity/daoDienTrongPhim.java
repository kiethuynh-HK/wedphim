//package com.example.wedphim.entity;
//
//import jakarta.persistence.*;
//import lombok.Data;
//
//import java.util.List;
//
//@Data
//@Entity
//@Table(name="daoDienTrongPhim")
//public class daoDienTrongPhim {
//
//    @EmbeddedId
//    private Long id;
//
//    @ManyToOne(fetch = FetchType.LAZY, optional = false)
//    @MapsId("daoDien_id")
//    @JoinColumn(name = "daoDien_id")
//    private daoDien DaoDien;
//
//    @ManyToOne(fetch = FetchType.LAZY, optional = false)
//    @MapsId("phim_id")
//    @JoinColumn(name = "phim_id")
//    private phim Phim;
//}