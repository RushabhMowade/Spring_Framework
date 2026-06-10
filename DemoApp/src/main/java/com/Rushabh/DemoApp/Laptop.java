package com.Rushabh.DemoApp;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component

public class Laptop implements Computer {

    @Override
    public void compile(){
        System.out.println("COMpilingggggg with laptop");
    }
}
