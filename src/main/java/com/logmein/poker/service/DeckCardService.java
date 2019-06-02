package com.logmein.poker.service;

import com.logmein.poker.domain.Deck;
import com.logmein.poker.domain.DeckCard;

import java.util.List;

public interface DeckCardService {
    List<DeckCard> addDeckCardsToDeck(Deck deck);

    void shuffleDeckCards(List<DeckCard> cards);
}
