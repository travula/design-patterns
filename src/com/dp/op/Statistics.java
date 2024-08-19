package com.dp.op;

public class Statistics implements DisplayElement, Observer {
    float temperature;
    float humidity;
    float pressure;

    public void update(float temperature, float humidity, float pressure) {
        this.temperature = temperature;
        this.humidity = humidity;
        this.pressure = pressure;
    }

    public void display() {
        System.out.println("Statistics are: temperature=" + temperature + " humidity=" + humidity + " pressure=" + pressure);
    }
    
}
