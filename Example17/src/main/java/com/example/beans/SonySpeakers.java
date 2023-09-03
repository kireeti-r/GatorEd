package com.example.beans;

import org.springframework.stereotype.Component;

@Component
public class SonySpeakers implements Speakers{
    @Override
    public void makeSound(){
        System.out.println("Making sound from SonySpeakers");
    }
}
