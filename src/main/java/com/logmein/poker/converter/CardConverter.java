package com.logmein.poker.converter;

import com.logmein.poker.domain.DeckCard;
import com.logmein.poker.dto.CardDTO;
import org.springframework.stereotype.Component;

@Component
public class CardConverter {
    public CardDTO toCardDTO(DeckCard deckCard) {
        return CardDTO.builder()
                .id(deckCard.getId())
                .suit(deckCard.getCard().getSuit().name())
                .face(deckCard.getCard().getFace().name())
                .build();
    }
}
