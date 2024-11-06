package com.example.gracefulshutdowntest;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor(force = true)
@Data
public class GracefulRequest {

  private final Long sequence;

}
