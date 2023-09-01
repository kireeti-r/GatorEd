package com.example.beans;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;
import org.springframework.stereotype.Component;

@Component
public class Vehicle {
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    @PostConstruct
    public void initialize(){
        this.setName("Honda");
    }
    public void printHello(){
        System.out.println("Printing Hello from Componen Vehicle Bean");
    }
    @PreDestroy
    public void destroy(){
        System.out.println("Destroying vehicle bean");
    }


}
