package com.gigateam.internetshopapi.repository;

import com.gigateam.internetshopapi.model.Order;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderRepository extends JpaRepository<Order, Long> {

}
