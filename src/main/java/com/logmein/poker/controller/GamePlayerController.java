package com.logmein.poker.controller;

import com.logmein.poker.service.GamePlayerCardService;
import com.logmein.poker.domain.Game;
import com.logmein.poker.domain.GamePlayerCard;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1/game/{gameId}/player/{playerId}")
public class GamePlayerController {

    @Autowired
    private GamePlayerCardService gamePlayerCardService;

    @RequestMapping(method = RequestMethod.POST)
    public ResponseEntity<GamePlayerCard> addPlayerToGame(@PathVariable Long gameId,
                                                          @PathVariable Long playerId) {
        return new ResponseEntity<>(gamePlayerCardService.addPlayerToGame(gameId, playerId),
                HttpStatus.OK);
    }

    @RequestMapping(method = RequestMethod.DELETE)
    public ResponseEntity<String> removePlayerFromGame(@PathVariable Long gameId,
                                                       @PathVariable Long playerId) {
        gamePlayerCardService.removePlayerFromGame(gameId, playerId);
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }

    @RequestMapping(value = "/deal", method = RequestMethod.PUT)
    public ResponseEntity<Game> dealCardToPlayer(@PathVariable Long gameId,
                                                 @PathVariable Long playerId,
                                                 @PathVariable Long numberOfCards) {
//        gamePlayerCardService.dealCards();
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);
    }

}
