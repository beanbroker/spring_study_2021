// package com.pkj.boker.demo.five;
//
//
// import lombok.extern.slf4j.Slf4j;
// import org.springframework.beans.factory.annotation.Autowired;
// import org.springframework.boot.ExitCodeGenerator;
// import org.springframework.boot.SpringApplication;
// import org.springframework.context.ApplicationContext;
// import org.springframework.web.bind.annotation.ExceptionHandler;
// import org.springframework.web.bind.annotation.RestControllerAdvice;
//
// @RestControllerAdvice
// @Slf4j
// public class SampleAdviceController {
//    @Autowired
//    private ApplicationContext applicationContext;
//
//    @ExceptionHandler(SampleException.class)
//    public void handleSampleException(SampleException sampleException) {
//
//        log.info("wow sampleException is occured {}", sampleException.getMessage());
////        SpringApplication.exit(applicationContext, () -> 40);
//        SpringApplication.exit(applicationContext, (ExitCodeGenerator) () -> 32);
//    }
//
// }
