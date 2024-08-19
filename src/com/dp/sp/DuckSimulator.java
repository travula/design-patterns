package com.dp.sp;

public class DuckSimulator {

    public static void main(String[] args) {
        Duck md = new MallardDuck();
        Duck rd = new RedheadDuck();

        md.display();
        md.performQuack();
        md.performFly();        
        
        rd.display();
        rd.performQuack();
        rd.performFly();
        rd.setFlyBehavior(new FlyWithWings());
        rd.performFly();        
        
    };

}


    
