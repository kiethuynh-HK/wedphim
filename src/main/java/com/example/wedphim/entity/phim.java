package com.example.wedphim.entity;

import com.example.wedphim.Validator.annotation.ValidCategoryId;
import com.example.wedphim.Validator.annotation.ValidNgonNguId;
import jakarta.persistence.*;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;
import lombok.Data;

import java.util.Date;

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
    @ManyToOne
    @JoinColumn(name = "idLoaiPhim")
    @ValidCategoryId
    private loaiPhim loaiphim;
    @ManyToOne
    @JoinColumn(name = "idNgonNgu")
    @ValidNgonNguId
    private ngonNgu ngonngu;
    @Column(name = "trailer")
    @NotNull
    private String trailer;
}
