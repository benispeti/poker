package com.logmein.poker.service.impl;

import com.logmein.poker.domain.Deck;
import com.logmein.poker.domain.Game;
import com.logmein.poker.repository.DeckRepository;
import com.logmein.poker.repository.GameRepository;
import com.logmein.poker.service.DeckService;
import com.logmein.poker.service.GameDeckService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.stereotype.Service;

@Service
public class GameDeckServiceImpl implements GameDeckService {
    @Autowired
    private GameRepository gameRepository;

    @Autowired
    private DeckRepository deckRepository;

    @Autowired
    private DeckService deckService;

    @Override
    public Game addDeckToGame(Long gameId, Long deckId) {
        Game game = gameRepository.findById(gameId).orElseThrow(() -> new EmptyResultDataAccessException(1));
        Deck deck = deckRepository.findById(deckId).orElseThrow(() -> new EmptyResultDataAccessException(1));

        Deck gameDeck = deckRepository.findByGame(game);
        if (gameDeck != null) {
            gameDeck.getCards().addAll(deck.getCards());
            deckRepository.save(gameDeck);
        } else {
            deck.setGame(game);
            deckRepository.save(deck);
        }
        return game;
    }

    @Override
    public void shuffleGameDeck(Long gameId) {
        Game game = gameRepository.findById(gameId).orElseThrow(() -> new EmptyResultDataAccessException(1));
        Deck deck = deckRepository.findByGame(game);
        deckService.shuffle(deck.getId());
    }


}
