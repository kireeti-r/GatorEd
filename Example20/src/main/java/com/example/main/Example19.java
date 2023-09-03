package com.example.main;

import com.example.beans.Person;
import com.example.config.ProjectConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Example19 {
    public static void main(String[] args) {

        var context =new AnnotationConfigApplicationContext(ProjectConfig.class);

        Person person1=context.getBean(Person.class);
        Person person2=context.getBean(Person.class);
        System.out.println("Hashcode of person1 is : "+person1.hashCode());
        System.out.println("Hashcode of person1 is : "+person2.hashCode());
        if(person1==person2){
            System.out.println("Same reference i.e singleton scope");
        }
        else{
            System.out.println("Differnt reference i.e. prototype scope");
        }

    }
}
