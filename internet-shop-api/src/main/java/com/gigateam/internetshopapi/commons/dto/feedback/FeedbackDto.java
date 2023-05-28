package com.gigateam.internetshopapi.commons.dto.feedback;

import lombok.Data;

@Data
public class FeedbackDto {

  private Long id;
  private Long userId;
  private Long itemId;
  private String comment;
  private Integer rate;

}
