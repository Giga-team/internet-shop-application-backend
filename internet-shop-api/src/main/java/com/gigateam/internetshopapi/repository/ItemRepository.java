package com.gigateam.internetshopapi.repository;

import com.gigateam.internetshopapi.model.Item;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ItemRepository extends JpaRepository<Item, Long> {

}