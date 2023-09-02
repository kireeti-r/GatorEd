package com.example.config;


import com.example.beans.*;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

@Configuration
@ComponentScan(basePackages = "com.example.beans")
public class ProjectConfig {
@Bean
    Vehicle vehicle(){
    Vehicle veh=new Vehicle();
    veh.setName("Ferrari");
    return veh;
}
@Bean
    VehicleServices vehicleServices(){
    VehicleServices vs=new VehicleServices();
    return vs;
}
@Bean
    Tyres tyres(){
    Tyres tyres=new BridgeStoneTyres();
    return tyres;
}
@Bean
    Speakers speakers() {
    Speakers speakers = new BoseSpeakers();
    return speakers;
}
}
