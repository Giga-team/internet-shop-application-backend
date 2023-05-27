package com.gigateam.internetshopapi.commons.api;

import lombok.AccessLevel;
import lombok.NoArgsConstructor;

@NoArgsConstructor(access = AccessLevel.PRIVATE)
public final class Responses {

  public static <T> ApiResponse<T> okResponse(String message, T body) {
    return new ApiResponse<>(Status.OK, message, body);
  }

  public static <T> ApiResponse<T> okResponse(T body) {
    return new ApiResponse<>(Status.OK, null, body);
  }

  public static <T> ApiResponse<T> emptyResponse(String message) {
    return new ApiResponse<>(Status.EMPTY_RESULT, message, null);
  }

  public static <T> ApiResponse<T> errorResponse(String message) {
    return new ApiResponse<>(Status.ERROR, message, null);
  }

}
