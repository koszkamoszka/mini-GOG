package com.koszkamoszka.minigog.model;

import lombok.Data;

import java.util.List;
import java.time.LocalDate;

@Data
public class Game {
    public enum Type {
        GAME, DLC, MUSIC
    }

    public enum Genre {
        INDIE, ADVENTURE, CASUAL, RPG, FANTASY, HORROR, ARCADE, SHOOTER
    }

    private String title;
    private Type type;
    private LocalDate publishedDate;
    private List<Studio> studios;
    private Genre genre;
    private Integer rating;
}

