package com.developersview.oauth2demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * @author pranoy.chakraborty
 * @Date 12/06/2023
 */
@Controller
public class HomeController {
    @GetMapping("/home")
    public String home(){
        return "Home";
    }
}
