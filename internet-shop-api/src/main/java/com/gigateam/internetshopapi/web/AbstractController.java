package com.gigateam.internetshopapi.web;

import com.gigateam.internetshopapi.commons.api.ApiResponse;
import com.gigateam.internetshopapi.commons.api.Responses;
import com.gigateam.internetshopapi.exception.OperationException;
import org.springframework.web.bind.annotation.ExceptionHandler;

public abstract class AbstractController {

  private static final String SOMETHING_WENT_WRONG = "Something went wrong";

  @ExceptionHandler(Throwable.class)
  public ApiResponse<Object> handleThrowable(Throwable error) {
    return Responses.errorResponse(SOMETHING_WENT_WRONG);
  }

  @ExceptionHandler(Exception.class)
  public ApiResponse<Object> handleException(Exception error) {
    return Responses.errorResponse(SOMETHING_WENT_WRONG);
  }

  @ExceptionHandler(OperationException.class)
  public ApiResponse<Object> handleOperationException(OperationException error) {
    return Responses.errorResponse(error.getUserMessage());
  }

}
