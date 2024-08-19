package com.dp.op;

public class WeatherStation {
    public static void main(String[] args) {
        WeatherData wd = new WeatherData();
        Forcast forcast = new Forcast();
        CurrentConditions currentConditions = new CurrentConditions();
        Statistics statistics = new Statistics();

        wd.register(statistics);
        wd.register(currentConditions);
        wd.register(forcast);

        System.out.println("The first reporting of the state");
        wd.setMeasurements(32, 54,180);
        forcast.display();
        currentConditions.display();
        statistics.display();
        System.out.println("The second reporting of the state");
        wd.setMeasurements(10, 22,280);
        forcast.display();
        currentConditions.display();
        statistics.display();

    }
    
}
