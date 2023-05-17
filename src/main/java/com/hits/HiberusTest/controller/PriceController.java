package com.hits.HiberusTest.controller;

import com.hits.HiberusTest.entities.PriceEntity;
import com.hits.HiberusTest.models.Price;
import com.hits.HiberusTest.services.PriceService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value = "/v1")
public class PriceController {

    private final PriceService priceService;

    public PriceController(PriceService priceService) {
        this.priceService = priceService;
    }


    @RequestMapping(value = "/price",method = RequestMethod.GET)
    public ResponseEntity<Price> getPrice(@RequestParam("productId") Long productId, @RequestParam("brandId") Long brandId, @RequestParam("date") String date ){
        return ResponseEntity.ok(priceService.findPriceByDateandPriority(productId, brandId, date));
    }

}
