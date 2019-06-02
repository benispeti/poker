package com.logmein.poker.service.impl;

import com.logmein.poker.repository.GameRepository;
import com.logmein.poker.domain.Card;
import com.logmein.poker.domain.Game;
import com.logmein.poker.domain.GamePlayerCard;
import com.logmein.poker.domain.Player;
import com.logmein.poker.repository.GamePlayerCardRepository;
import com.logmein.poker.repository.PlayerRepository;
import com.logmein.poker.service.DeckService;
import com.logmein.poker.service.GamePlayerCardService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class GamePlayerCardServiceImpl implements GamePlayerCardService {
    @Autowired
    private GameRepository gameRepository;

    @Autowired
    private PlayerRepository playerRepository;

    @Autowired
    private GamePlayerCardRepository gamePlayerCardRepository;

    @Autowired
    private DeckService deckService;

    @Override
    public GamePlayerCard addPlayerToGame(Long gameId, Long playerId) {
        Game game = gameRepository.findById(gameId).orElseThrow(() -> new EmptyResultDataAccessException(1));
        Player player = playerRepository.findById(playerId).orElseThrow(() -> new EmptyResultDataAccessException(1));
        GamePlayerCard gamePlayerCard = GamePlayerCard.builder().game(game).player(player).build();
        return gamePlayerCardRepository.save(gamePlayerCard);
    }

    @Override
    public void removePlayerFromGame(Long gameId, Long playerId) {
        Game game = gameRepository.findById(gameId).orElseThrow(() -> new EmptyResultDataAccessException(1));
        Player player = playerRepository.findById(playerId).orElseThrow(() -> new EmptyResultDataAccessException(1));
        gamePlayerCardRepository.deleteByGameAndPlayer(game, player);
    }

    @Override
    public void dealCards(Long gameId, Long playerId, int numberOfCards) {
        Game game = gameRepository.findById(gameId).orElseThrow(() -> new EmptyResultDataAccessException(1));
        Player player = playerRepository.findById(playerId).orElseThrow(() -> new EmptyResultDataAccessException(1));
        GamePlayerCard gamePlayerCard = gamePlayerCardRepository.findByGameAndPlayer(game, player);
//        deckService.getGameDeck(game)

//        gamePlayerCard.setCard();
    }

    @Override
    public List<Card> getCards(Player player) {
        return null;
    }
}
