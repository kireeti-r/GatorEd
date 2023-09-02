package com.example.beans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class VehicleServices {

    @Autowired
    private  Tyres tyres;

    @Autowired
    private Speakers speakers;
    public VehicleServices(){

    }

    public void rotateVehicle( ){
        this.tyres.rotate();

    }

    public void playMusic(){
        this.speakers.makeSound();


    }




}
