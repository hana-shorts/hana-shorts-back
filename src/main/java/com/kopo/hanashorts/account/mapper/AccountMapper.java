package com.kopo.hanashorts.account.mapper;

import com.kopo.hanashorts.account.model.Account;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface AccountMapper {
  Account getAccountByUserId(@Param("userId") String userId);
}
