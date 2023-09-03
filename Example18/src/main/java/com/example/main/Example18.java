package com.example.main;

import com.example.beans.Person;
import com.example.config.ProjectConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Example18 {
    public static void main(String[] args) {

        var context =new AnnotationConfigApplicationContext(ProjectConfig.class);
        System.out.println("Before Creating Person Bean");
        Person person=context.getBean(Person.class);
        System.out.println("After Creating Person Bean");
    }
}
