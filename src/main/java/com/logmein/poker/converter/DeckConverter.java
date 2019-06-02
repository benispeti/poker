package com.logmein.poker.converter;

import com.logmein.poker.domain.Deck;
import com.logmein.poker.dto.DeckDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.stream.Collectors;

@Component
public class DeckConverter {
    @Autowired
    private CardConverter cardConverter;

    public DeckDTO toDeckDTO(Deck deck) {
        return DeckDTO.builder()
                .id(deck.getId())
                .gameId(deck.getGame() != null ? deck.getGame().getId().toString() : null)
                .cards(deck.getCards() != null ? deck.getCards().stream().map(deckCard -> cardConverter.toCardDTO(deckCard)).collect(Collectors.toList()) : null)
                .build();
    }
}
