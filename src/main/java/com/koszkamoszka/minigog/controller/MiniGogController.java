package com.koszkamoszka.minigog.controller;

import com.koszkamoszka.minigog.model.Game;

import com.koszkamoszka.minigog.repository.GameRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/game")
public class MiniGogController {
    @Autowired
    private GameRepository gameRepository;

    @PutMapping(consumes = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<?> createGame(@RequestBody Game game) {
        gameRepository.save(game);
        return ResponseEntity.ok().build();
    }

    @GetMapping("/{title}")
    public Game getGame(@PathVariable String title) {
        return gameRepository.findByTitle(title);
    }

    @PostMapping(consumes = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<?> update(@RequestBody Game game) {
        gameRepository.save(game);
        return ResponseEntity.ok().build();
    }

    @GetMapping (produces = MediaType.APPLICATION_JSON_VALUE)
    public List<Game> getGames() {
        return gameRepository.findAll();
    }

    @DeleteMapping("/{title}")
    public ResponseEntity<?> removeGame(@PathVariable String title) {
        gameRepository.deleteByTitle(title);
        return ResponseEntity.ok().build();
    }
}
