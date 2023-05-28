package com.gigateam.internetshopapi.web;

import com.gigateam.internetshopapi.commons.api.ApiResponse;
import com.gigateam.internetshopapi.commons.api.Responses;
import com.gigateam.internetshopapi.commons.dto.item.ItemDto;
import com.gigateam.internetshopapi.service.ItemService;
import java.util.List;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RestController
@RequiredArgsConstructor
public class ItemController {

  private final ItemService itemService;

  @GetMapping("/items")
  public ApiResponse<List<ItemDto>> findAll() {
    log.info("Request on finding all items");

    return Responses.okResponse(itemService.findAll());
  }

}
