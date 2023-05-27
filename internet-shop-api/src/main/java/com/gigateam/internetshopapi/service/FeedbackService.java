package com.gigateam.internetshopapi.service;

import com.gigateam.internetshopapi.commons.dto.feedback.FeedbackDto;
import java.util.List;

public interface FeedbackService {

  List<FeedbackDto> findAllByItemId(Long itemId);

}
