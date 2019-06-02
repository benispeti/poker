package com.logmein.poker.repository;

import com.logmein.poker.domain.Deck;
import com.logmein.poker.domain.Game;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface DeckRepository extends JpaRepository<Deck, Long> {
    Deck findByGame(Game game);
}
