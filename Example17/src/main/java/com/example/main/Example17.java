package com.example.main;

import com.example.beans.Person;
import com.example.beans.VehicleServices;
import com.example.config.ProjectConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Example17 {
    public static void main(String[] args) {
        var context=new AnnotationConfigApplicationContext(ProjectConfig.class);
        VehicleServices vehicleServices1=context.getBean(VehicleServices.class);
        VehicleServices vehicleServices2=context.getBean(VehicleServices.class);
        System.out.println("Hashcode of vehicleservices1: "+ vehicleServices1.hashCode());
        System.out.println("Hashcode of vehicleservices2: "+ vehicleServices2.hashCode());
        if(vehicleServices1==vehicleServices2){
            System.out.println("Bean scope is singleton");
        }







    }
}
