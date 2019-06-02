package com.logmein.poker.service.impl;

import com.logmein.poker.converter.DeckConverter;
import com.logmein.poker.domain.Deck;
import com.logmein.poker.domain.Game;
import com.logmein.poker.dto.DeckDTO;
import com.logmein.poker.repository.DeckRepository;
import com.logmein.poker.service.DeckCardService;
import com.logmein.poker.service.DeckService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class DeckServiceImpl implements DeckService {

    @Autowired
    private DeckCardService deckCardService;

    @Autowired
    private DeckRepository deckRepository;

    @Autowired
    private DeckConverter deckConverter;

    @Override
    @Transactional
    public DeckDTO createDeck() {
        Deck deck = Deck.builder().build();
        deck.setCards(deckCardService.addDeckCardsToDeck(deck));
        deckRepository.save(deck);
        return deckConverter.toDeckDTO(deck);
    }

    @Override
    public DeckDTO getGameDeck(Game game) {
        Deck deck = deckRepository.findByGame(game);
        return deckConverter.toDeckDTO(deck);
    }

    @Override
    public void shuffle(Long id) {
        Deck deck = deckRepository.findById(id).orElseThrow(() -> new EmptyResultDataAccessException(1));
        deckCardService.shuffleDeckCards(deck.getCards());
    }

}
