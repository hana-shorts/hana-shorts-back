package com.kopo.hanashorts.user.mapper;

import com.kopo.hanashorts.user.model.UserDTO;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface UserMapper {
  UserDTO findByUserId(@Param("userId") String userId);
  void insertUser(UserDTO user);
}
