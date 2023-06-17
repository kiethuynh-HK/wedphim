package com.example.wedphim.entity;

import jakarta.persistence.*;
import lombok.Data;

import java.util.List;

@Data
@Entity
@Table(name="dienVienTrongPhim")
public class dienVienTrongPhim {
    @EmbeddedId
    private Integer id;

    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @MapsId("dienVienTrongPhim")
    @JoinColumn(name = "DienVienId")
    private dienVien dienViens;
    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @MapsId("dienVienTrongPhim")
    @JoinColumn(name = "PhimId")
    private phim phims;
}
