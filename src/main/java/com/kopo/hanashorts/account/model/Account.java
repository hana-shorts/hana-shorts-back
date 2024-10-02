package com.kopo.hanashorts.account.model;

import java.util.Date;

public class Account {
  private String accountNumber;
  private String userId;
  private Date accountRegistrationDate;
  private String accountStatus;

  // getters and setters
  public String getAccountNumber() {
    return accountNumber;
  }
  public void setAccountNumber(String accountNumber) {
    this.accountNumber = accountNumber;
  }
  public String getUserId() {
    return userId;
  }
  public void setUserId(String userId) {
    this.userId = userId;
  }
  public Date getAccountRegistrationDate() {
    return accountRegistrationDate;
  }
  public void setAccountRegistrationDate(Date accountRegistrationDate) {
    this.accountRegistrationDate = accountRegistrationDate;
  }
  public String getAccountStatus() {
    return accountStatus;
  }
  public void setAccountStatus(String accountStatus) {
    this.accountStatus = accountStatus;
  }
}
