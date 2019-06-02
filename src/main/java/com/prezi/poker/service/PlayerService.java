package com.prezi.poker.service;

import com.prezi.poker.domain.Player;

public interface PlayerService {
    Player createPlayer(Player player);

    void deletePlayer(Long playerId);
}
