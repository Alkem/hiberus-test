package com.hits.HiberusTest.services;

import com.hits.HiberusTest.entities.PriceEntity;
import com.hits.HiberusTest.models.Price;


public interface PriceService {

    Price findPriceByDateandPriority(Long productId, Long brandId, String date);
}
