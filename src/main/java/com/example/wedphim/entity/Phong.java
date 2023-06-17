package com.example.wedphim.entity;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;
import lombok.Data;
import org.hibernate.annotations.OnDelete;
import org.hibernate.annotations.OnDeleteAction;

@Data
@Entity
@Table(name = "phongg")
public class Phong {
    @Id
    @Column(name="id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    @Column(name = "name")
    @NotEmpty(message = "Title must not be empty")
    private String name;
    @Column(name = "capacity")
    private int capacity;
    @Column(name = "totalArea")
    @NotNull(message="totalArea is required")
    private double totalArea;

    @Column(length = 1000)
    private String imgURL;

    @ManyToOne
    @JoinColumn(nullable = false,name = "chinhanh_id")
    @OnDelete(action = OnDeleteAction.CASCADE)
    private chiNhanh chinhanh;
}
