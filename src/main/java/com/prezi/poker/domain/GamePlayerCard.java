package com.prezi.poker.domain;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
public class GamePlayerCard {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "game_id")
    private Game game;

    @ManyToOne
    @JoinColumn(name = "player_id")
    private Player player;

    @ManyToOne
    @JoinColumn(name = "card_id")
    private DeckCard card;
}
