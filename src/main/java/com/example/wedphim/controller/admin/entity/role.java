package com.example.wedphim.controller.admin.entity;

import jakarta.persistence.*;
import lombok.Data;

import java.util.List;

@Data
@Entity
@Table(name = "role")
public class role {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column
    private String roleName;
    @OneToMany(mappedBy = "roles" , fetch = FetchType.LAZY)
    private List<nhanVien> nhanviens;
}
