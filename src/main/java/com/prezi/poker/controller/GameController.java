package com.prezi.poker.controller;

import com.prezi.poker.domain.Game;
import com.prezi.poker.domain.PlayerPoints;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/v1/game")
public class GameController {

    @RequestMapping(method = RequestMethod.POST)
    public ResponseEntity<Game> createGame() {
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);
    }

    @RequestMapping(value = "/{gameId}", method = RequestMethod.DELETE)
    public ResponseEntity<Game> deleteGame(@PathVariable Long gameId) {
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);
    }

    @RequestMapping(value = "/{gameId}/playersPoints", method = RequestMethod.GET)
    public ResponseEntity<List<PlayerPoints>> getPlayersPoints(@PathVariable Long gameId) {
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);
    }

}
