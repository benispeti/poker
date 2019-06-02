package com.prezi.poker.controller;

import com.prezi.poker.domain.Player;
import com.prezi.poker.service.PlayerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1/player")
public class PlayerController {

    @Autowired
    private PlayerService playerService;

    @RequestMapping(method = RequestMethod.POST)
    public ResponseEntity<Player> createPlayer(@RequestBody Player player) {
        return new ResponseEntity<>(playerService.createPlayer(player),
                HttpStatus.CREATED);
    }

    @RequestMapping(value = "/{playerId}", method = RequestMethod.DELETE)
    public ResponseEntity<String> deletePlayer(@PathVariable Long playerId) {
        playerService.deletePlayer(playerId);
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }

}
