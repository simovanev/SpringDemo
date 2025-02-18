package com.udemy.springcoredemo.rest;

import com.udemy.springcoredemo.common.Coach;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoController {

    private Coach myCoach;


    @Autowired
    public DemoController(@Qualifier("swimCoach") Coach myCoach) {
        this.myCoach = myCoach;
    }

    @GetMapping("action")
    public String action() {
        return myCoach.dailyWorkout();
    }
}
