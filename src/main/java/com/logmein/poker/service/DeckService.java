package com.logmein.poker.service;

import com.logmein.poker.domain.Game;
import com.logmein.poker.dto.DeckDTO;

public interface DeckService {
    DeckDTO createDeck();

    DeckDTO getGameDeck(Game game);

    void shuffle(Long id);
}
