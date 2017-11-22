package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;


@RestController
@SpringBootApplication
public class DemoApplication {

    @RequestMapping(value = "/reverse", method = RequestMethod.GET)
    public String showHello(@RequestParam String word) {
        String z = "";
        char[] chars = word.toCharArray();
        for (int i=chars.length-1 ;i>=0;i--){
            z+=chars[i];
        }
        return z;
    }
    public static void main(String[] args) {
        SpringApplication.run(DemoApplication.class, args);
    }

}
