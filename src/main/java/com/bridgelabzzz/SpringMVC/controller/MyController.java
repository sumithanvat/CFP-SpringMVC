package com.bridgelabzzz.SpringMVC.controller;


import com.bridgelabzzz.SpringMVC.model.Data;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

@Controller
    public class MyController {
        @GetMapping("/web")
        public String hello() {

            return "hello";
        }

        @GetMapping("/greeting")
        public String greeting() {
            return "greeting";
        }
        @PostMapping("/login")

        public String greeting(@RequestBody Data data){
            return "login";
        }
}
