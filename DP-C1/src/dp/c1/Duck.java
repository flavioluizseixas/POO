/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dp.c1;

/**
 *
 * @author fseixas
 */
public abstract class Duck {
    
    FlyBehavior flyBehavior;
    QuackBehavior quackBehavior;
    
    public abstract void display();
    
    public void performFly() {
        flyBehavior.fly();
    }
    
    public void performQuack() {
        quackBehavior.quack();
    }
    
    public void setFlyBehavior(FlyBehavior fb) {
        flyBehavior = fb;
    }
    
    public void setQuackBehavior(QuackBehavior qb) {
        quackBehavior = qb;
    }
    
    public void swim() {
        System.out.println("All ducks float, even decoys!");
    }
}