package com.prezi.poker.controller;

import com.prezi.poker.domain.Deck;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/deck")
public class DeckController {

    @RequestMapping(method = RequestMethod.POST)
    public ResponseEntity<Deck> createDeck() {
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);
    }

}
