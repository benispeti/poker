package com.logmein.poker.service;

import com.logmein.poker.domain.Game;

public interface GameDeckService {
    Game addDeckToGame(Long gameId, Long deckId);

    void shuffleGameDeck(Long gameId);

}
