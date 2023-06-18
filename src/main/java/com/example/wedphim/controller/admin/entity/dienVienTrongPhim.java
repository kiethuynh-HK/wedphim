package com.example.wedphim.controller.admin.entity;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name="dienVienTrongPhim")
public class dienVienTrongPhim {
    @EmbeddedId
    private Long id;

    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @MapsId("dienVien_id")
    @JoinColumn(name = "dienVien_id")
    private dienVien DienVien;
    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @MapsId("phim_id")
    @JoinColumn(name = "phim_id")
    private phim Phim;
}
