package com.prezi.poker.domain;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
public class DeckCard {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "deck_id")
    private Deck deck;

    @ManyToOne
    @JoinColumn(name = "card_id")
    private Card card;
}
