package com.prezi.poker.domain;

import lombok.Data;

import java.util.List;

@Data
public class Player {
    private String name;
    private List<Card> cards;
}
