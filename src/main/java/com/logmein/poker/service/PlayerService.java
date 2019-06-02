package com.logmein.poker.service;

import com.logmein.poker.domain.Player;

public interface PlayerService {
    Player createPlayer(Player player);

    void deletePlayer(Long playerId);
}
