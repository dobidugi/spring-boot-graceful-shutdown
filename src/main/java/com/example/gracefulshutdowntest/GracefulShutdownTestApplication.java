package com.example.gracefulshutdowntest;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class GracefulShutdownTestApplication {

  public static void main(String[] args) {
    SpringApplication.run(GracefulShutdownTestApplication.class, args);
  }

}
