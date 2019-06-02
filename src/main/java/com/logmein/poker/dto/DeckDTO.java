package com.logmein.poker.dto;

import lombok.Builder;
import lombok.Data;

import java.util.List;

@Data
@Builder
public class DeckDTO {
    private long id;
    private String gameId;
    private List<CardDTO> cards;
}
