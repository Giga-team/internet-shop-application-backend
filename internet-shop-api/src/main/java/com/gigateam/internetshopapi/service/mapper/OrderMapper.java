package com.gigateam.internetshopapi.service.mapper;

import com.gigateam.internetshopapi.commons.dto.order.OrderDto;
import com.gigateam.internetshopapi.model.Order;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;

@Mapper(componentModel = "spring")
public abstract class OrderMapper {

  @Mappings({
      @Mapping(target = "id", ignore = true)
  })
  public abstract Order toEntity(OrderDto dto);

  public abstract OrderDto toDto(Order entity);

}
