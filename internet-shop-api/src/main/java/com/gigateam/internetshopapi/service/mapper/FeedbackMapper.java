package com.gigateam.internetshopapi.service.mapper;

import com.gigateam.internetshopapi.commons.dto.feedback.FeedbackDto;
import com.gigateam.internetshopapi.model.Feedback;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;

@Mapper(componentModel = "spring")
public abstract class FeedbackMapper {

  @Mappings({
      @Mapping(target = "id", ignore = true)
  })
  public abstract Feedback toEntity(FeedbackDto dto);

  public abstract FeedbackDto toDto(Feedback entity);

}
