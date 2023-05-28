package com.gigateam.internetshopapi.web;

import com.gigateam.internetshopapi.commons.api.ApiResponse;
import com.gigateam.internetshopapi.commons.api.Responses;
import com.gigateam.internetshopapi.exception.OperationException;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController extends AbstractController {

  @GetMapping("/help")
  public ApiResponse<Object> help() {
    if (1 == 1) {
      throw OperationException.of("ABABBAAB");
    }

    return Responses.emptyResponse("FAAFF");
  }

}
