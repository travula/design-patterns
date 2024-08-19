package com.dp.op;

public interface Subject {

    public void register(Observer obs);
    public void deregister(Observer obs);
    public void notifyObservers();
    
}
