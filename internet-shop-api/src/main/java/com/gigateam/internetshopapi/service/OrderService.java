package com.gigateam.internetshopapi.service;

import com.gigateam.internetshopapi.commons.dto.order.OrderDto;
import java.util.List;

public interface OrderService {

  List<OrderDto> findAllByUserId(Long userId);

}
