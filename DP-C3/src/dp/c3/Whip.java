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
public class Whip extends CodimentDecorator {
    Beverage beverage;
    
    public Whip(Beverage beverage) {
        this.beverage = beverage;
    }
    
    public String getDescription() {
        return beverage.getDescription() + ", Whip";
    }
    
    public double cost() {
        return .20 + beverage.cost();
    }
}
