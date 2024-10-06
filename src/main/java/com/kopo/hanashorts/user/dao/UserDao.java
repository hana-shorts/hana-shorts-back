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

  public void updatePreliminaryEducation(UserDTO user) {
    userMapper.updatePreliminaryEducation(user);
  }

  public void updateMockTrading(UserDTO user) {
    userMapper.updateMockTrading(user);
  }

  // 외부 시스템 테이블 조회 메서드 추가
  public boolean verifyPreliminaryEducation(String userId, String completionNumber) {
    Integer count = userMapper.countPreliminaryEducation(userId, completionNumber);
    return count != null && count > 0;
  }

  public boolean verifyMockTrading(String userId, String authenticationKey) {
    System.out.println("verifyMockTrading - userId: " + userId + ", authenticationKey: " + authenticationKey);
    Integer count = userMapper.countMockTrading(userId, authenticationKey);
    return count != null && count > 0;
  }

}
