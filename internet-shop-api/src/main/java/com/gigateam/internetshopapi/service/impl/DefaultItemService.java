package com.gigateam.internetshopapi.service.impl;

import com.gigateam.internetshopapi.commons.dto.item.ItemDto;
import com.gigateam.internetshopapi.repository.ItemRepository;
import com.gigateam.internetshopapi.service.ItemService;
import com.gigateam.internetshopapi.service.mapper.ItemMapper;
import java.util.Optional;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class DefaultItemService implements ItemService {

  private final ItemRepository repository;
  private final ItemMapper mapper;

  @Override
  public Optional<ItemDto> findById(Long id) {
    return repository.findById(id).map(mapper::toDto);
  }

}
