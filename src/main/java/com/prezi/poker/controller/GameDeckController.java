package com.prezi.poker.controller;

import com.prezi.poker.domain.Face;
import com.prezi.poker.domain.Game;
import com.prezi.poker.domain.Suit;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/api/v1/game/{gameId}/deck")
public class GameDeckController {

    @RequestMapping(method = RequestMethod.PUT)
    public ResponseEntity<Game> addDeckToGame(@PathVariable Long gameId,
                                              @RequestBody Long deckId) {
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);
    }

    @RequestMapping(value = "/shuffle", method = RequestMethod.PUT)
    public ResponseEntity<Game> shuffleDeck(@PathVariable Long gameId) {
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);
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
