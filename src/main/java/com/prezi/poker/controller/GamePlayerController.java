package com.prezi.poker.controller;

import com.prezi.poker.domain.Game;
import com.prezi.poker.domain.Player;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1/game/{gameId}/player/{playerId}")
public class GamePlayerController {
    @RequestMapping(method = RequestMethod.POST)
    public ResponseEntity<Game> addPlayerToGame(@PathVariable Long gameId,
                                                @RequestBody Player player) {
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);
    }

    @RequestMapping(method = RequestMethod.DELETE)
    public ResponseEntity<Game> removePlayerFromGame(@PathVariable Long gameId,
                                             @PathVariable Long playerId) {
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);
    }

    @RequestMapping(value = "/deal", method = RequestMethod.PUT)
    public ResponseEntity<Game> dealCardToPlayer(@PathVariable Long gameId,
                                                 @PathVariable Long playerId) {
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);
    }

}
