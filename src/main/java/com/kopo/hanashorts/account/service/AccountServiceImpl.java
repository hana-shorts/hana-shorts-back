package com.kopo.hanashorts.account.service;

import com.kopo.hanashorts.account.dao.AccountDao;
import com.kopo.hanashorts.account.model.Account;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AccountServiceImpl implements AccountService {
  @Autowired
  private AccountDao accountDao;

  @Override
  public Account getAccountByUserId(String userId) {
    return accountDao.getAccountByUserId(userId);
  }
}
