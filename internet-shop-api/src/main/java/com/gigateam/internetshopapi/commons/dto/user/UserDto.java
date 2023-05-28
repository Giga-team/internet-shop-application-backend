package com.gigateam.internetshopapi.commons.dto.user;

import com.gigateam.internetshopapi.model.UserRole;
import lombok.Data;


@Data
public class UserDto {

  private Long id;
  private String email;
  private UserRole role;

}
