package com.logmein.poker.service;

import com.logmein.poker.domain.*;

import java.util.List;
import java.util.Map;

public interface GameService {
    Game createGame();

    void deleteGame(Long gameId);

    List<PlayerPoints> getPlayersPoints(Game game);

    Map<Suit, Integer> getCardCountLeftPerSuit(Game game);

    Map<List<Face>, Integer> getCardCountLeftPerFace(Game game);
}
