package com.kopo.hanashorts.user.dto;

import lombok.Data;

@Data
public class RegisterRequest {
  private String userId;
  private String password;
  private String name;
  private Long ssn1;
  private Long ssn2;
  private String email;
  private String phoneNumber;
}
