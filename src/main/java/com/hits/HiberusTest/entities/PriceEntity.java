package com.hits.HiberusTest.entities;


import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;

@Getter
@Setter
@Entity
public class PriceEntity {
    @Id
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
