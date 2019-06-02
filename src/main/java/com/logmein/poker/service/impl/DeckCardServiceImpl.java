package com.logmein.poker.service.impl;

import com.logmein.poker.domain.Deck;
import com.logmein.poker.service.DeckCardService;
import com.logmein.poker.domain.DeckCard;
import com.logmein.poker.repository.DeckCardRepository;
import com.logmein.poker.service.CardService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class DeckCardServiceImpl implements DeckCardService {
    @Autowired
    private CardService cardService;

    @Autowired
    private DeckCardRepository deckCardRepository;

    @Override
    public List<DeckCard> addDeckCardsToDeck(Deck deck) {
        List<DeckCard> deckCards = cardService.createCardList().stream()
                .map(card -> DeckCard.builder().deck(deck).card(card).build())
                .collect(Collectors.toList());
        shuffleDeckCards(deckCards);
        return deckCardRepository.saveAll(deckCards);
    }

    @Override
    public void shuffleDeckCards(List<DeckCard> cards) {
        Collections.shuffle(cards);//TODO remove library shuffle
    }
}
