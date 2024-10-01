package com.kopo.hanashorts.user.service;

import com.kopo.hanashorts.user.dao.UserDao;
import com.kopo.hanashorts.user.model.UserDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {

  private final UserDao userDao;

  @Autowired
  public UserService(UserDao userDao) {
    this.userDao = userDao;
  }

  /**
   * 사용자 인증 메서드
   * @param userId 사용자 ID
   * @param password 사용자 비밀번호
   * @return 인증된 사용자 정보 또는 null
   */
  public UserDTO authenticate(String userId, String password) {
    UserDTO user = userDao.findByUserId(userId);
    if (user != null && user.getPassword().equals(password)) {
      return user;
    }
    return null;
  }

  /**
   * 사용자 등록 메서드
   * @param user 등록할 사용자 정보
   */
  public void register(UserDTO user) {
    userDao.save(user);
  }
}
