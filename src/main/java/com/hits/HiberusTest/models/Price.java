package com.hits.HiberusTest.models;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;

@Getter
@Setter
@Builder
public class Price {
    Long id;
    Long brandId;
    LocalDate startDate;
    LocalDate endDate;
    Long priceList;
    Long productId;
    Integer priority;
    Double price;
    String curr;
}
