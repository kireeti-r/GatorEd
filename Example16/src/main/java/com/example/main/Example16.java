package com.example.main;

import com.example.beans.Person;
import com.example.beans.Vehicle;
import com.example.config.ProjectConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Example16 {
    public static void main(String[] args) {
        var context=new AnnotationConfigApplicationContext(ProjectConfig.class);
        Person person=context.getBean(Person.class);
        System.out.println(person.getName());
        System.out.println(person.getVehicle().getName());
        person.getVehicle().getVehicleServices().rotateVehicle();
        person.getVehicle().getVehicleServices().playMusic();






    }
}
