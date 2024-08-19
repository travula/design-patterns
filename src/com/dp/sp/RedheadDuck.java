package com.dp.sp;

public class RedheadDuck extends Duck {

    public RedheadDuck() {
        flyBehavior = new FlyNoWay();
        quackBehavior = new Squeak();
    }
    
    public void display() {
        System.out.println("Redhead Duck");
    }

}


    
