package com.example.homework46.controller;

import com.example.homework46.service.InfoService;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/info")
public class InfoController {

    private final InfoService infoService;

    public InfoController(InfoService infoService) {
        this.infoService = infoService;
    }

    @GetMapping
    public void testParallelStream(){
        infoService.testParallelStream();
    }

    @GetMapping("/printStudents")
    public void printStudents(){
        infoService.printStudents();
    }

    @GetMapping("/printStudentsSync")
    public void printStudentsSync(){
        infoService.printStudentsSync();
    }

    @Value("8080")
    private int port;

    @GetMapping("/port")
    public int getPort(){
        return port;
    }
}
