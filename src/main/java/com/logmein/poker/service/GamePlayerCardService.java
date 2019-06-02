package com.logmein.poker.service;

import com.logmein.poker.domain.Card;
import com.logmein.poker.domain.GamePlayerCard;
import com.logmein.poker.domain.Player;

import java.util.List;

public interface GamePlayerCardService {
    GamePlayerCard addPlayerToGame(Long gameId, Long playerId);

    void removePlayerFromGame(Long gameId, Long playerId);

    void dealCards(Long gameId, Long playerId, int numberOfCards);

    List<Card> getCards(Player player);
}
