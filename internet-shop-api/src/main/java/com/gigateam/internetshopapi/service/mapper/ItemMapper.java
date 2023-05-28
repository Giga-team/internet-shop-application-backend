package com.gigateam.internetshopapi.service.mapper;

import com.gigateam.internetshopapi.commons.dto.item.ItemDto;
import com.gigateam.internetshopapi.model.Item;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;

@Mapper(componentModel = "spring")
public abstract class ItemMapper {

  @Mappings({
      @Mapping(target = "id", ignore = true)
  })
  public abstract Item toEntity(ItemDto dto);

  public abstract ItemDto toDto(Item entity);

}
