package com.prezi.poker.service;

import com.prezi.poker.domain.Game;

public interface GameService {
    Game createGame();

    void deleteGame(Long gameId);
}
