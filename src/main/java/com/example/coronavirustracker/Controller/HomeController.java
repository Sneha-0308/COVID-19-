package com.example.coronavirustracker.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

//you can also use @RestController annotation if you need response in json but we require in html format so we use @Controller
@Controller
public class HomeController {
    @GetMapping("/")
    public String home(Model model){
        model.addAttribute("testName","TEST");
        return "home";
    }
}
