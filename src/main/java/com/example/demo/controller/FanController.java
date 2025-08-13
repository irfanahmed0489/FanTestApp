package com.example.demo.controller;

import com.example.demo.fan.Fan;
import com.example.demo.services.FanService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;

@RestController
public class FanController {
    private FanService fanService;

    @Autowired
    public FanController(FanService fanService) {
        this.fanService = fanService;
    }

    ArrayList<Fan> fanArrayList = new ArrayList<>();


    @GetMapping("/fan/switchon/{fanNumber}")
    public void switchOn(@PathVariable int fanNumber) {
        fanService.switchOn(fanNumber);
    }


    @GetMapping("/fan/switchoff/{fanNumber}")
    public void switchOff(@PathVariable Integer fanNumber) {
        fanService.switchOff(fanNumber);
    }


    @GetMapping("/fan/increasespeed/{fanNumber}")
    public void increaseSpeed(@PathVariable int fanNumber) {
        fanService.increaseSpeed(fanNumber);
    }


    @GetMapping("/fan/decreasespeed/{fanNumber}")
    public void decreaseSpeed(@PathVariable int fanNumber) {
        fanService.decreaseSpeed(fanNumber);
    }


    @GetMapping("/fan/fanReport")
    public void fanReport() {
        fanService.fanReport();
    }
}
