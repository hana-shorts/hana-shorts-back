package com.kopo.hanashorts.user.dto;

import com.kopo.hanashorts.user.model.UserDTO;
import lombok.Data;

@Data
public class LoginResponse {
  private boolean success;
  private String message;
  private UserDTO user;
}
