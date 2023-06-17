package com.example.wedphim.entity;

import jakarta.persistence.*;
import lombok.Data;

import java.util.List;

@Data
@Entity
@Table(name="daoDienTrongPhim")
public class daoDienTrongPhim {

    @EmbeddedId
    private Integer id;

    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @MapsId("daoDienTrongPhim")
    @JoinColumn(name = "DaoDienId")
    private daoDien daodiens;
    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @MapsId("daoDienTrongPhim")
    @JoinColumn(name = "PhimId")
    private phim phims;
}
