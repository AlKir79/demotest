package org.example.model;

public class Car {
    private String name;
    private int power;


    public Car(String name, int power) {
        this.name = name;
        this.power = power;
    }

    public Car() {
        this.name = null;
        this.power = 0;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPower() {
        return power;
    }

    public void setPower(int power) {
        this.power = power;
    }
}
