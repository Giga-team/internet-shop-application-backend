package com.gigateam.internetshopapi.commons.dto.item;

import java.math.BigDecimal;
import lombok.Data;

@Data
public class ItemDto {

  private Long id;
  private String name;
  private String description;
  private BigDecimal price;

}
