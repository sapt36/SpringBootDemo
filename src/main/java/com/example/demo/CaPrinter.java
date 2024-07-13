package com.example.demo;

import org.springframework.stereotype.Component;

@Component
public class CaPrinter implements Printer{

    @Override
    public void print(String message){
        System.out.println("CA printer: " + message);
    }
}
