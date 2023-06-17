package com.example.wedphim.entity;

import com.example.wedphim.Validator.annotation.ValidCategoryId;
import com.example.wedphim.Validator.annotation.ValidNgonNguId;
import jakarta.persistence.*;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;
import lombok.Data;

import java.util.Date;
import java.util.Set;

@Data
@Entity
@Table(name="phim")
public class phim {
    @Id
    @Column(name="id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name = "tenPhim")
    @NotEmpty(message = "Ten phim khong duoc de trong")
    private String tenPhim;
    @Column(name = "thoiLuongChieu")
    @NotNull(message = "Thoi luong chieu khong duoc de trong")
    private Integer thoiLuongChieu;
    @Column(name = "image")
    @NotNull
    private String image;
    @Column(name = "ngayKhoiChieu")
    @NotNull
    private Date ngayKhoiChieu;
    @Column(name = "rated")
    @NotNull
    private float rated;
    @Column(name = "trailer")
    @NotNull
    private String trailer;
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name="LoaiPhimId")
    private loaiPhim loaiPhims;
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name="NgonNguId")
    private ngonNgu ngonNgus;
    @OneToMany(mappedBy = "phim", cascade =CascadeType.ALL)
    private Set<daoDienTrongPhim> daodien_tp;
    @OneToMany(mappedBy = "phim", cascade =CascadeType.ALL)
    private Set<dienVienTrongPhim> dienvien_tp;
}
