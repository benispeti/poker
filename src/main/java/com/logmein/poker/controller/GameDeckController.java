package com.logmein.poker.controller;

import com.logmein.poker.domain.Face;
import com.logmein.poker.domain.Suit;
import com.logmein.poker.domain.Game;
import com.logmein.poker.service.GameDeckService;
import com.logmein.poker.service.GameService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/api/v1/game/{gameId}/deck")
public class GameDeckController {
    @Autowired
    private GameDeckService gameDeckService;

    @RequestMapping(method = RequestMethod.PUT)
    public ResponseEntity<Game> addDeckToGame(@PathVariable Long gameId,
                                              @RequestBody Long deckId) {
        return new ResponseEntity<>(gameDeckService.addDeckToGame(gameId, deckId),
                HttpStatus.OK);
    }

    @RequestMapping(value = "/shuffle", method = RequestMethod.PUT)
    public ResponseEntity<String> shuffleDeck(@PathVariable Long gameId) {
        gameDeckService.shuffleGameDeck(gameId);
        return new ResponseEntity<>(HttpStatus.OK);
    }

    @RequestMapping(value = "/cardCount/suit", method = RequestMethod.GET)
    public ResponseEntity<Map<Suit, Long>> getCardCountPerSuit(@PathVariable Long gameId) {
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);
    }

    @RequestMapping(value = "/cardCount/face", method = RequestMethod.GET)
    public ResponseEntity<Map<List<Face>, Long>> getCardCountPerFace(@PathVariable Long gameId) {
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);
    }

}
