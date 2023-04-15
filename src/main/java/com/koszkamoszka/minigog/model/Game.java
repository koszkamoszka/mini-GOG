package com.koszkamoszka.minigog.model;

import jakarta.persistence.*;
import lombok.Data;

import java.util.List;
import java.time.LocalDate;

@Entity(name = "games")
@Data
public class Game {
    public enum Type {
        GAME, DLC, MUSIC
    }

    public enum Genre {
        INDIE, ADVENTURE, CASUAL, RPG, FANTASY, HORROR, ARCADE, SHOOTER
    }

    @Id
    @Column(name = "gameId")
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String title;

    @Enumerated(EnumType.STRING)
    private Type type;

    private LocalDate publishedDate;

    @Enumerated(EnumType.STRING)
    private Genre genre;

    private Integer rating;

//    private List<Studio> studios;
}

