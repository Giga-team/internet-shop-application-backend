package com.gigateam.internetshopapi.repository;

import com.gigateam.internetshopapi.model.Order;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

public interface OrderRepository extends JpaRepository<Order, Long> {

    @Query("""
      SELECT o
      FROM Order o
      WHERE o.userId = :userId
  """)
    List<Order> findAllByUserId(@Param("userId") Long userId);

}
