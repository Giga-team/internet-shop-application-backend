package com.gigateam.internetshopapi.web;

import com.gigateam.internetshopapi.commons.api.ApiResponse;
import com.gigateam.internetshopapi.commons.api.Responses;
import com.gigateam.internetshopapi.commons.dto.item.ItemDto;
import com.gigateam.internetshopapi.service.ItemService;
import java.util.List;
import java.util.Optional;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
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

  @GetMapping("/items/{id}")
  public ResponseEntity<ApiResponse<ItemDto>> findById(@PathVariable("id") Long id) {
    log.info("Request on finding item by id. Id: {}", id);

    return itemService.findById(id)
        .map(item -> ResponseEntity.ok(Responses.okResponse(item)))
        .orElse(
            ResponseEntity.status(404)
                .body(Responses.emptyResponse(String.format("Item with id: %d not found", id)))
        );
  }

}
