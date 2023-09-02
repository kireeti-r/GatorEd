package com.example.beans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class Person {
//    public Person(){
//        System.out.println("Person bean created by Spring");
//    }

    private String name="Lucy";

    private Vehicle vehicle;

    @Autowired
    public Person(@Qualifier("vehicle3") Vehicle vehicle){
        this.vehicle=vehicle;
    }

    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name=name;
    }

    public Vehicle getVehicle() {
        return vehicle;
    }


    public void setVehicle(Vehicle vehicle) {
        this.vehicle = vehicle;
    }
}
