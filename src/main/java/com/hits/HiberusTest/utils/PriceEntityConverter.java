package com.hits.HiberusTest.utils;

import com.hits.HiberusTest.entities.PriceEntity;
import com.hits.HiberusTest.models.Price;

public class PriceEntityConverter {
    public static Price convert (PriceEntity priceEntity){
        return Price.builder()
                .id(priceEntity.getId())
                .brandId(priceEntity.getBrandId())
                .startDate(priceEntity.getStartDate())
                .endDate(priceEntity.getEndDate())
                .priceList(priceEntity.getPriceList())
                .productId(priceEntity.getProductId())
                .priority(priceEntity.getPriority())
                .price(priceEntity.getPrice())
                .curr(priceEntity.getCurr()).build();
    }
}
