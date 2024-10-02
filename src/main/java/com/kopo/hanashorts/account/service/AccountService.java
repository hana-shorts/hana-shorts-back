package com.kopo.hanashorts.account.service;

import com.kopo.hanashorts.account.model.Account;

public interface AccountService {
  Account getAccountByUserId(String userId);
}
