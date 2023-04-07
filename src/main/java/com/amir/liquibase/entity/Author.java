package com.amir.liquibase.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;

import java.io.Serializable;
@Data
@RequiredArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "authors")
public class Author  {

    @Id
    @Column(name = "id", nullable = false, unique = true)
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;


    @Column(name = "name", nullable = false, unique = true)
    private String name;
}
