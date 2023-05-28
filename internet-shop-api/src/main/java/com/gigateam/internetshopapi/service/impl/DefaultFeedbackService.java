package com.gigateam.internetshopapi.service.impl;

import com.gigateam.internetshopapi.commons.dto.feedback.FeedbackDto;
import com.gigateam.internetshopapi.repository.FeedbackRepository;
import com.gigateam.internetshopapi.service.FeedbackService;
import com.gigateam.internetshopapi.service.mapper.FeedbackMapper;
import java.util.List;
import java.util.stream.Collectors;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class DefaultFeedbackService implements FeedbackService {

  private final FeedbackRepository repository;
  private final FeedbackMapper mapper;

  @Override
  public List<FeedbackDto> findAllByItemId(Long itemId) {
    return repository.findAllByItemId(itemId).stream()
        .map(mapper::toDto)
        .collect(Collectors.toList());
  }

}
