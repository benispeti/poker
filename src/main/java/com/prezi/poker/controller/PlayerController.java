package com.prezi.poker.controller;

import com.prezi.poker.domain.Player;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1/player")
public class PlayerController {

    @RequestMapping(method = RequestMethod.POST)
    public ResponseEntity<Player> createPlayer(@RequestBody Player player) {
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);
    }

    @RequestMapping(value = "/{playerId}", method = RequestMethod.DELETE)
    public ResponseEntity<Player> deletePlayer(@PathVariable Long playerId) {
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);
    }

}
