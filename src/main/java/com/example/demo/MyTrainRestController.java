package com.example.demo;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
@Slf4j
public class MyTrainRestController {

    @GetMapping("/timetable")
    public String timetable(){
        log.info("Serve timetable...");
        return "Train comes soon!";
    }
}
