package com.prezi.poker.domain;

import lombok.Data;

import java.util.List;

@Data
public class Game {
    Deck deck;
    List<Player> players;
}
