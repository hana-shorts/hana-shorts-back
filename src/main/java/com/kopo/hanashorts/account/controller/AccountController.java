package com.kopo.hanashorts.account.controller;

import com.kopo.hanashorts.account.model.Account;
import com.kopo.hanashorts.account.service.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/account")
public class AccountController {
  @Autowired
  private AccountService accountService;

  @GetMapping("/{userId}")
  public Account getAccountByUserId(@PathVariable String userId) {
    return accountService.getAccountByUserId(userId);
  }
}
