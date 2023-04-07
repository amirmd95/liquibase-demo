package com.amir.liquibase.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;
import org.springframework.boot.context.properties.bind.Name;
@RequiredArgsConstructor
@Data
@AllArgsConstructor
@Entity
@Table(name = "books")
public class Book {
    @Id
    @Column(name = "id", nullable = false, unique = true)
    private Integer id;

    @Column(name = "name", nullable = false, unique = true)
    private String name;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "author")
    private Author author;
}

