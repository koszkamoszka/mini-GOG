package com.koszkamoszka.minigog;

import com.koszkamoszka.minigog.model.Game;

import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/game")
public class MiniGogController {
    private final List<Game> games = new ArrayList<>();
    @PutMapping(consumes = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<?> createGame(@RequestBody Game game) {
        games.add(game);
        return ResponseEntity.ok().build();
    }

    @GetMapping (produces = MediaType.APPLICATION_JSON_VALUE)
    public List<Game> getGame() {return games;}

    @DeleteMapping("/{title}")
    public ResponseEntity<?> removeGame(@PathVariable String title) {
        for (Game game : games) {
            if (game.getTitle().equals(title)) {
                games.remove(game);
                break;
            }
        }
        return ResponseEntity.ok().build();
    }
}
