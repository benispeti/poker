package com.logmein.poker.controller;

import com.logmein.poker.dto.DeckDTO;
import com.logmein.poker.service.DeckService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/deck")
public class DeckController {

    @Autowired
    private DeckService deckService;

    @RequestMapping(method = RequestMethod.POST)
    public ResponseEntity<DeckDTO> createDeck() {
        return new ResponseEntity<>(deckService.createDeck(), HttpStatus.CREATED);
    }

}
