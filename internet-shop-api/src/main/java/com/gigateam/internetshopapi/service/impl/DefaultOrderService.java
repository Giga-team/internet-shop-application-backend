package com.gigateam.internetshopapi.service.impl;

import com.gigateam.internetshopapi.commons.dto.order.OrderDto;
import com.gigateam.internetshopapi.repository.OrderRepository;
import com.gigateam.internetshopapi.service.OrderService;
import com.gigateam.internetshopapi.service.mapper.OrderMapper;
import java.util.List;
import java.util.stream.Collectors;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class DefaultOrderService implements OrderService {

  private final OrderRepository repository;
  private final OrderMapper mapper;

  @Override
  public List<OrderDto> findAllByUserId(Long userId) {
    return repository.findAllByUserId(userId).stream()
        .map(mapper::toDto)
        .collect(Collectors.toList());
  }

}
