package com.logmein.poker.dto;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class CardDTO {
    private long id;
    private String suit;
    private String face;
}
