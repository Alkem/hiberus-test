package com.hits.HiberusTest.services.impl;

import com.hits.HiberusTest.entities.PriceEntity;
import com.hits.HiberusTest.models.Price;
import com.hits.HiberusTest.repositories.PriceRepository;
import com.hits.HiberusTest.services.PriceService;
import com.hits.HiberusTest.utils.DateConverter;
import com.hits.HiberusTest.utils.PriceEntityConverter;
import org.springframework.stereotype.Service;

@Service("priceService")
public class PriceServiceImpl implements PriceService {

    private final PriceRepository priceRepository;

    public PriceServiceImpl(PriceRepository priceRepository) {
        this.priceRepository = priceRepository;
    }

    @Override
    public Price findPriceByDateandPriority(Long productId, Long brandId, String date) {
        return PriceEntityConverter.convert(priceRepository.findPriceByDateandPriority(productId,brandId, DateConverter.convert(date)));
    }




}
