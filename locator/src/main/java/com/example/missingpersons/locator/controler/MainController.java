package com.example.missingpersons.locator.controler;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping
public class MainController {



    @GetMapping("/dashboard")
    public String getDashboard( Model model){

        return "dashboard";

    }







}
