package com.gigateam.internetshopapi.service;

import com.gigateam.internetshopapi.commons.dto.item.ItemDto;
import java.util.List;
import java.util.Optional;

public interface ItemService {

  Optional<ItemDto> findById(Long id);

  List<ItemDto> findAll();

}
