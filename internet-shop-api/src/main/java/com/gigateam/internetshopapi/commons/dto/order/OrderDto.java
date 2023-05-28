package com.gigateam.internetshopapi.commons.dto.order;

import lombok.Data;

@Data
public class OrderDto {

    private Long id;
    private Long userId;
    private String items;

}