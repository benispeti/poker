package com.logmein.poker.service.impl;

import com.logmein.poker.domain.*;
import com.logmein.poker.repository.GameRepository;
import com.logmein.poker.service.GameService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

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

    @Override
    public List<PlayerPoints> getPlayersPoints(Game game) {
        return null;
    }

    @Override
    public Map<Suit, Integer> getCardCountLeftPerSuit(Game game) {
        return null;
    }

    @Override
    public Map<List<Face>, Integer> getCardCountLeftPerFace(Game game) {
        return null;
    }

}
