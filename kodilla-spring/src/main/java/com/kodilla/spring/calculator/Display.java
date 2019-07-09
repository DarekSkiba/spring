package com.kodilla.spring.calculator;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration

public class Display {
    @Bean
    public void displayValue(double c) {
        System.out.println("Result =" + c);
    }
}