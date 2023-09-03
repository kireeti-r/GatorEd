package com.example.beans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Lazy;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("prototype")
public class Person {

    private String name="Lucy";
    Person(){
        System.out.println("Person Bean Created");
    }



    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


}
