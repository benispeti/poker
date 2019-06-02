package com.prezi.poker.service.impl;

import com.prezi.poker.domain.Player;
import com.prezi.poker.repository.PlayerRepository;
import com.prezi.poker.service.PlayerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PlayerServiceImpl implements PlayerService {
    @Autowired
    private PlayerRepository playerRepository;

    @Override
    public Player createPlayer(Player player) {
        return playerRepository.save(player);
    }

    @Override
    public void deletePlayer(Long playerId) {
        playerRepository.deleteById(playerId);
    }
}
