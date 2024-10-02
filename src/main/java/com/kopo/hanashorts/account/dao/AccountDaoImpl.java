package com.kopo.hanashorts.account.dao;

import com.kopo.hanashorts.account.mapper.AccountMapper;
import com.kopo.hanashorts.account.model.Account;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class AccountDaoImpl implements AccountDao {
  @Autowired
  private AccountMapper accountMapper;

  @Override
  public Account getAccountByUserId(String userId) {
    return accountMapper.getAccountByUserId(userId);
  }
}
