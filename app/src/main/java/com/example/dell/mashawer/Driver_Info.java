package com.example.dell.mashawer;

/**
 * Created by Dell on 12/23/2017.
 */

public class Driver_Info {
private String name;
private String time;
private String distenaton;

    public Driver_Info(String name, String distenaton) {
        this.name = name;
        this.distenaton = distenaton;
    }

    public Driver_Info(String name, String time, String distenaton) {
        this.name = name;
        this.time = time;
        this.distenaton = distenaton;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public String getDistenaton() {
        return distenaton;
    }

    public void setDistenaton(String distenaton) {
        this.distenaton = distenaton;
    }
}

