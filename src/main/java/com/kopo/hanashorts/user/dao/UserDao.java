package com.kopo.hanashorts.user.dao;

import com.kopo.hanashorts.user.mapper.UserMapper;
import com.kopo.hanashorts.user.model.UserDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class UserDao {

  private final UserMapper userMapper;

  @Autowired
  public UserDao(UserMapper userMapper) {
    this.userMapper = userMapper;
  }

  public UserDTO findByUserId(String userId) {
    return userMapper.findByUserId(userId);
  }

  public void save(UserDTO user) {
    userMapper.insertUser(user);
  }
}
