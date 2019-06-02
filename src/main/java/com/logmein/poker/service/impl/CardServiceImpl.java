package com.logmein.poker.service.impl;

import com.logmein.poker.domain.Card;
import com.logmein.poker.domain.Face;
import com.logmein.poker.domain.Suit;
import com.logmein.poker.service.CardService;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class CardServiceImpl implements CardService {
    @Override
    public List<Card> createCardList() {
        List<Card> cards = new ArrayList<>();
        for(Suit suit: Suit.values()) {
            for(Face face: Face.values()) {
                Card card = Card.builder().suit(suit).face(face).build();
                cards.add(card);
            }
        }
        return cards;
    }
}
