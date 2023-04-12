package com.koszkamoszka.minigog.model;

import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;

@Getter
@Setter
public class Studio {
    private String name;
    private String country;
    private LocalDate foundationDate;
}
