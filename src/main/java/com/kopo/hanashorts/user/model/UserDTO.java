package com.kopo.hanashorts.user.model;

import lombok.Data;

import java.util.Date;

@Data
public class UserDTO {
  private String userId;
  private String password;
  private String name;
  private Long ssn1;
  private Long ssn2;
  private String email;
  private String phoneNumber;
  private Date signupDate;
  private Date lastLogin;

  // New fields
  private String preliminaryEducationCompleted;
  private Date preliminaryEducationDate;
  private String mockTradingCompleted;
  private Date mockTradingDate;
}

