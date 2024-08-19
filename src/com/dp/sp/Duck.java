package com.dp.sp;

public abstract class Duck {

    
    FlyBehavior flyBehavior;
    QuackBehavior quackBehavior;

    public Duck() {

    }
        
    
    public void performFly() {
        flyBehavior.fly();
    }

    public void performQuack() {
        quackBehavior.quack();
    }

    public void setFlyBehavior(FlyBehavior flyBehavior) {
        this.flyBehavior = flyBehavior;
    }

    public void setQuackBehavior(QuackBehavior quackBehavior) {
        this.quackBehavior = quackBehavior;
    }
    
    public void swim() {
        System.out.println("Only one Swim");
    };

    public abstract void display(); 

    // public void fly() {
    //     System.out.println("fly");
    // };

    // public void quack() {
    //     System.out.println("quack");
    // };
    
        
}


    
