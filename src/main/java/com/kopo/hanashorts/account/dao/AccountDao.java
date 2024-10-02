package com.kopo.hanashorts.account.dao;

import com.kopo.hanashorts.account.model.Account;

public interface AccountDao {
  Account getAccountByUserId(String userId);
}
