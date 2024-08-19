package com.dp.op;

import java.util.ArrayList;

public class WeatherData implements Subject {

    ArrayList<Observer> observers;
    float temperature;
    float humidity;
    float pressure;
    
    public WeatherData() {
        observers = new ArrayList<>();
    }
    public void register(Observer obs) {
        observers.add(obs);
    }

    public void deregister(Observer obs) {
        int i = observers.indexOf(obs);
        if (i >= 0)
            observers.remove(i);
    }

    public void notifyObservers() {
        for (int i = 0; i < observers.size(); i++) {
            Observer observer = observers.get(i);
            observer.update(temperature, humidity, pressure);
        }
    }

    public void measurementsChanged() {
        notifyObservers();
    }

    public void setMeasurements(float temperature, float humidity, float pressure) {
        this.temperature = temperature;
        this.humidity = humidity;
        this.pressure = pressure;
        measurementsChanged();
    }
    
}
