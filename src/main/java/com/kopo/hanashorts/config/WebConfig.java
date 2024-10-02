package com.kopo.hanashorts.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.*;

@Configuration
public class WebConfig implements WebMvcConfigurer {

  @Override
  public void addCorsMappings(CorsRegistry registry) {
    registry.addMapping("/api/**")
            .allowedOrigins("http://localhost:3000") // React 앱의 주소
            .allowedMethods("GET", "POST", "PUT", "DELETE")
            .allowCredentials(true);
  }
}
