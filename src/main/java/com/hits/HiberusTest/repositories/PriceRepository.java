package com.hits.HiberusTest.repositories;

import com.hits.HiberusTest.entities.PriceEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.time.LocalDateTime;


public interface PriceRepository extends JpaRepository<PriceEntity,Long> {

    @Query(
            value = "select  * from prices p where p.product_id = :productId and brand_id = :brandId and :date BETWEEN p.start_date  and p.end_date \n" +
                    "order by p.priority desc limit 1",
            nativeQuery = true)
    PriceEntity findPriceByDateandPriority(@Param("productId") Long productId, @Param("brandId") Long brandId, @Param("date") LocalDateTime date);
}
