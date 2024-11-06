package com.example.gracefulshutdowntest;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RestController
public class GracefulController {




  @PostMapping ("/graceful")
  public String graceful(@RequestBody GracefulRequest request) {
    log.info("start processing request {}", request.getSequence());
    try {
      Thread.sleep(15000);
    } catch (InterruptedException e) {
      log.error("error processing request {}", request.getSequence(), e);
    }
    log.info("end processing request {}", request.getSequence());

    return "graceful";
  }
}




