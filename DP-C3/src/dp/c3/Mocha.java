/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dp.c3;

/**
 *
 * @author fseixas
 */
public class Mocha extends CodimentDecorator {
    Beverage beverage;
    
    public Mocha(Beverage beverage) {
        this.beverage = beverage;
    }
    
    public String getDescription() {
        return beverage.getDescription() + ", Mocha";
    }
    
    public double cost() {
        return .20 + beverage.cost();
    }
}
