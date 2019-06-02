package com.prezi.poker.service.impl;

import com.prezi.poker.domain.Game;
import com.prezi.poker.repository.GameRepository;
import com.prezi.poker.service.GameService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class GameServiceImpl implements GameService {

    @Autowired
    private GameRepository gameRepository;

    @Override
    public Game createGame() {
        return gameRepository.save(new Game());
    }

    @Override
    public void deleteGame(Long gameId) {
        gameRepository.deleteById(gameId);
    }
}
