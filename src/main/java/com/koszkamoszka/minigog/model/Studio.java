package com.koszkamoszka.minigog.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;

@Getter
@Setter
@Entity(name = "studios")
public class Studio {
    @Id
    @Column(name = "studioId")
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String name;
    private String country;
    private LocalDate foundationDate;
}
