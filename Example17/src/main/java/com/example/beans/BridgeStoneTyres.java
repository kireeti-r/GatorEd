package com.example.beans;

import org.springframework.stereotype.Component;

@Component
public class BridgeStoneTyres implements Tyres{
    public void rotate(){
        System.out.println("Rotating BridgeStone Tyres");
    }
}
