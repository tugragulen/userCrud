package com.example.demo;

import com.example.demo.model.User;
import com.example.demo.service.UserService;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Driver {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(DemoApplication.class);
        UserService userService = (UserService) context.getBean("userService");
        User tg = new User("Tuğra", "Gülen", "tgulen");
        userService.save(tg);
        User mari = new User("Mert", "Arısoy", "marisoy");
        userService.save(mari);
        User mmk = new User("Muhammed", "Topgül", "mtopgul");
        userService.save(mmk);
        System.out.println("========================================================");
        System.out.println(userService.findAll());
        System.out.println("========================================================");
        mmk.setName("MMK");
        userService.save(mmk);
        System.out.println("========================================================");
        userService.findByName("Tuğra")
                .ifPresent(System.out::println);
        System.out.println("========================================================");
        userService.delete(mari.getId());
        System.out.println("========================================================");
        System.out.println(userService.findAll());
    }
}
