package com.example.main;

import com.example.beans.Vehicle;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Example9 {
    public static void main(String[] args) {
        var context=new ClassPathXmlApplicationContext("beans.xml");
        Vehicle veh=context.getBean(Vehicle.class);
        System.out.println(veh.getName());



    }
}
