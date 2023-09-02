package com.example.beans;

public class SonySpeakers implements Speakers{
    @Override
    public void makeSound(){
        System.out.println("Making sound from SonySpeakers");
    }
}
