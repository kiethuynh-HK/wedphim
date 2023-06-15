package com.example.wedphim.entity;
import jakarta.persistence.*;
import lombok.Data;
@Data
@Entity
@Table
public class loaiPhim {
    @Id
    @Column(name="id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

}
