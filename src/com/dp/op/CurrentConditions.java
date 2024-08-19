package com.dp.op;

public class CurrentConditions implements Observer, DisplayElement{

    float temperature;
    float humidity;
    float pressure;

    public void update(float temperature, float humidity, float pressure) {
        this.temperature = temperature;
        this.humidity = humidity;
        this.pressure = pressure;
    }

    public void display() {
        System.out.println("The current conditions are: temperature=" + temperature + " humidity=" + humidity + " pressure=" + pressure);
    }
}
