package com.example.main;

import com.example.beans.Vehicle;
import com.example.config.ProjectConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Example3 {
    public static void main(String[] args) {

        var context=new AnnotationConfigApplicationContext(ProjectConfig.class);
        Vehicle veh=context.getBean("ferrariVehicle",Vehicle.class);
        System.out.println("Vehicle name from Spring Context is: " + veh.getName());


    }
}
