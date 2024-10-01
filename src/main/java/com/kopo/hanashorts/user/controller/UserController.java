package com.kopo.hanashorts.user.controller;

import com.kopo.hanashorts.user.dto.LoginRequest;
import com.kopo.hanashorts.user.dto.LoginResponse;
import com.kopo.hanashorts.user.dto.RegisterRequest;
import com.kopo.hanashorts.user.model.UserDTO;
import com.kopo.hanashorts.user.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import jakarta.servlet.http.HttpSession;


@RestController
@RequestMapping("/api/user")
@CrossOrigin(origins = "http://localhost:3000", allowCredentials = "true") // React 앱이 실행되는 도메인
public class UserController {

  private final UserService userService;

  @Autowired
  public UserController(UserService userService) {
    this.userService = userService;
  }

  /**
   * 로그인 API
   * @param loginRequest 로그인 요청 데이터
   * @param session HTTP 세션
   * @return 로그인 응답
   */
  @PostMapping("/login")
  public ResponseEntity<LoginResponse> login(@RequestBody LoginRequest loginRequest, HttpSession session) {
    LoginResponse response = new LoginResponse();
    UserDTO user = userService.authenticate(loginRequest.getUserId(), loginRequest.getPassword());

    if (user != null) {
      response.setSuccess(true);
      response.setMessage("로그인 성공");
      response.setUser(user);
      // 세션에 사용자 정보 저장
      session.setAttribute("user", user);
    } else {
      response.setSuccess(false);
      response.setMessage("아이디 또는 비밀번호가 올바르지 않습니다.");
    }

    return ResponseEntity.ok(response);
  }

  /**
   * 로그인 상태 확인 API
   * @param session HTTP 세션
   * @return 로그인 상태 응답
   */
  @GetMapping("/status")
  public ResponseEntity<LoginResponse> getLoginStatus(HttpSession session) {
    UserDTO user = (UserDTO) session.getAttribute("user");
    if (user != null) {
      LoginResponse response = new LoginResponse();
      response.setSuccess(true);
      response.setMessage("로그인 상태");
      response.setUser(user);
      return ResponseEntity.ok(response);
    } else {
      LoginResponse response = new LoginResponse();
      response.setSuccess(false);
      response.setMessage("로그아웃 상태");
      response.setUser(null);
      return ResponseEntity.ok(response);
    }
  }

  /**
   * 로그아웃 API
   * @param session HTTP 세션
   * @return 로그아웃 응답
   */
  @PostMapping("/logout")
  public ResponseEntity<LoginResponse> logout(HttpSession session) {
    session.invalidate();
    LoginResponse response = new LoginResponse();
    response.setSuccess(false);
    response.setMessage("로그아웃 되었습니다.");
    response.setUser(null);
    return ResponseEntity.ok(response);
  }

  /**
   * 회원가입 API
   * @param registerRequest 회원가입 요청 데이터
   * @return 회원가입 응답
   */
  @PostMapping("/register")
  public ResponseEntity<LoginResponse> register(@RequestBody RegisterRequest registerRequest) {
    UserDTO user = new UserDTO();
    user.setUserId(registerRequest.getUserId());
    user.setPassword(registerRequest.getPassword());
    user.setName(registerRequest.getName());
    user.setSsn1(registerRequest.getSsn1());
    user.setSsn2(registerRequest.getSsn2());
    user.setEmail(registerRequest.getEmail());
    user.setPhoneNumber(registerRequest.getPhoneNumber());
    user.setSignupDate(new java.util.Date());
    user.setLastLogin(new java.util.Date());

    try {
      userService.register(user);
      LoginResponse response = new LoginResponse();
      response.setSuccess(true);
      response.setMessage("회원가입 성공");
      response.setUser(null);
      return ResponseEntity.ok(response);
    } catch (Exception e) {
      e.printStackTrace();
      LoginResponse response = new LoginResponse();
      response.setSuccess(false);
      response.setMessage("회원가입 실패");
      response.setUser(null);
      return ResponseEntity.ok(response);
    }
  }
}
