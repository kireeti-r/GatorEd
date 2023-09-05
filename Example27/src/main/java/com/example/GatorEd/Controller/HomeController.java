package com.example.GatorEd.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.ui.Model;

@Controller
public class HomeController {
    @RequestMapping(value={"/home", "", "/"})
    public String displayHomePage(Model model){
        model.addAttribute("username", "John Doe");
        return "home.html";
    }


}
