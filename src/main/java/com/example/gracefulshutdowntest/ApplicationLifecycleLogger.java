package com.example.gracefulshutdowntest;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.context.event.ApplicationReadyEvent;
import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextClosedEvent;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Component;

@Slf4j
@Component
public class ApplicationLifecycleLogger implements ApplicationListener<ApplicationReadyEvent> {


  // 애플리케이션 시작 로그
  @Override
  public void onApplicationEvent(ApplicationReadyEvent event) {
    log.info("==============================================================");
    log.info("                      Application Start                       ");
    log.info("==============================================================");
  }

  // 애플리케이션 종료 로그
  @EventListener(ContextClosedEvent.class)
  public void onShutdownEvent() {
    log.info("==============================================================");
    log.info("                      Application End                         ");
    log.info("==============================================================");
  }
}
