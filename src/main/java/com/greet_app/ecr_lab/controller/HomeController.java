package com.greet_app.ecr_lab.controller;

import com.greet_app.ecr_lab.service.GreetingService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequiredArgsConstructor
public class HomeController {
    private final GreetingService greetingService;
    
    @GetMapping("/")
    public String showForm() {
        return "form";
    }
    
    @PostMapping("/greet")
    public String home(@RequestParam(defaultValue = "Developer") String name, Model model) {
        String message = greetingService.greeting(name);
        model.addAttribute("message", message);
        return "index";
    }
}
