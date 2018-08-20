package com.leaf;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
@RequestMapping("/classPath")
public class Application {

   /* @RequestMapping("/")
    public String greeting(){
        return "Hello World";
    }*/

    @RequestMapping("/")
    public String index(){
        return "Index Page";
    }

    @RequestMapping("/hello")
    public String hello(){
        return "Hello World";
    }

    @RequestMapping("/methodPath")
    public String method(){
        return "mapping url is /classPath/methodPath";
    }

    @RequestMapping("/users/{username}")
    public String userProfile(@PathVariable("username") String username){
        return String.format("user %s", username);
    }

    @RequestMapping("/posts/{id}")
    public String post(@PathVariable("id") int id){
        return String.format("post %d", id);
    }

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }
}
