package com.com.was.myrestfulservice.bean;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class HelloWorldBean {
    private final String message;
//    public HelloWorldBean(String message){
//        this.message = message;
//    }
}
