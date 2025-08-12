package com.example.demo.services;

import com.example.demo.fan.Fan;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
@Service
public class FanService {
    ArrayList<Fan> fanArrayList = new ArrayList<>();
    private Fan f1; // Selected fan
    private int overAllCount = 0;
    private int countOfFansOn = 0;

    public FanService() {
        int i = 1;
        while (i <= 180) {
            // Creating the fan
            Fan f = new Fan();
            // Adding the fan to warehouse (Fan arraylist)
            fanArrayList.add(f);
            i++;
        }
    }

    // Set the fan to operate on
    public void setFan(Fan fan) {
        this.f1 = fan;
    }

    public void switchOn(int fanNumber) {
        Fan f1 = fanArrayList.get(fanNumber);
        if (!f1.isSwitchedOn()) {
            System.out.println("Starting the fan");
            f1.switchOnTheFan();
            overAllCount++;
            countOfFansOn++;
        } else {
            System.out.println("Fan is already running");
        }
    }

    public void switchOff(Integer fanNumber) {
        Fan f1 = fanArrayList.get(fanNumber);
        f1.switchOfTheFan();
        System.out.println("Fan is switched");
        overAllCount++;
        countOfFansOn--;
    }

    public void increaseSpeed(int fanNumber) {
        Fan f1 = fanArrayList.get(fanNumber);
        f1.increaseSpeed();
        overAllCount++;
        System.out.println("Fan speed is: " + f1.getSpeed());
    }

    public void decreaseSpeed(int fanNumber) {
        Fan f1 = fanArrayList.get(fanNumber);
        f1.decreaseSpeed();
        overAllCount++;
        System.out.println("Fan speed is: " + f1.getSpeed());
    }

    public void fanReport() {
        System.out.println("No of fans in switched on status: " + countOfFansOn);
        System.out.println("Overall count of buttons tested: " + overAllCount);
    }
}
