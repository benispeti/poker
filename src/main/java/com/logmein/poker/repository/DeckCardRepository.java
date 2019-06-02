package com.logmein.poker.repository;

import com.logmein.poker.domain.DeckCard;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DeckCardRepository extends JpaRepository<DeckCard, Long> {
}
