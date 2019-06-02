package com.logmein.poker.repository;

import com.logmein.poker.domain.Game;
import com.logmein.poker.domain.GamePlayerCard;
import com.logmein.poker.domain.Player;
import org.springframework.data.jpa.repository.JpaRepository;

public interface GamePlayerCardRepository extends JpaRepository<GamePlayerCard, Long> {
    GamePlayerCard findByGameAndPlayer(Game game, Player player);
    void deleteByGameAndPlayer(Game game, Player player);
}
