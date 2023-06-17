package com.example.wedphim.entity;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotEmpty;
import lombok.Data;

@Data
@Entity
@Table(name = "chinhanhh")
public class chiNhanh {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    @Column(length = 2000)
    private String imgURL;
    @Column(name = "name")
    @NotEmpty(message = "Title must not be empty")
    private String name;
    @Column(name = "diachi")
    @NotEmpty(message = "Title must not be empty")
    private String diaChi;
    @Column(name = "phoneno")
    @NotEmpty(message = "Title must not be empty")
    private String phoneNo;
}
