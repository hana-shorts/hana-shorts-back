package com.kopo.hanashorts.user.mapper;

import com.kopo.hanashorts.user.model.UserDTO;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface UserMapper {
  UserDTO findByUserId(@Param("userId") String userId);
  void insertUser(UserDTO user);

  // New methods
  void updatePreliminaryEducation(UserDTO user);
  void updateMockTrading(UserDTO user);

  Integer countMockTrading(@Param("userId") String userId, @Param("authenticationKey") String authenticationKey);
  Integer countPreliminaryEducation(@Param("userId") String userId, @Param("completionNumber") String completionNumber);
}

