package com.example.config;


import com.example.model.*;
import org.springframework.context.annotation.*;

@Configuration
@EnableAspectJAutoProxy
@ComponentScan(basePackages = {"com.example.implementation",
        "com.example.services","com.example.aspects"})


public class ProjectConfig {

}
