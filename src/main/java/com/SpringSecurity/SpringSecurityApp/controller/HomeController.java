package com.SpringSecurity.SpringSecurityApp.controller;

import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController
{
    @RequestMapping("/index")
    public String index()
    {
        return "index";
    }

    @RequestMapping("/about")
    public String about()
    {
        return "about";
    }
   @PreAuthorize("hasAuthority('USER')")
    @RequestMapping("/home")
    public String home()
    {
        return "home";
    }
}
