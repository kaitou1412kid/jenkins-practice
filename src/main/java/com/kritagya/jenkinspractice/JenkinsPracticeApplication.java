package com.kritagya.jenkinspractice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class JenkinsPracticeApplication {

    private static final String MESSAGE = "Hello World!";

    public static void main(String[] args) {
        SpringApplication.run(JenkinsPracticeApplication.class, args);
        System.out.println(MESSAGE);
    }

    public String getMessage() {
        return MESSAGE;
    }

}
