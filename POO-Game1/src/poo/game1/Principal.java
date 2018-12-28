/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package poo.game1;

import java.util.Arrays;

/**
 *
 * @author fseixas
 */
public class Principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int numOfGuesses = 0;
        
        GameHelper helper = new GameHelper();
        
        SimpleBatalhaNaval sbn = new SimpleBatalhaNaval();
        
        int randomNum = (int) (Math.random() * 5) + 1;
        
        int[] locations = {randomNum, randomNum+1, randomNum+2};
        System.out.println(Arrays.toString(locations));
        sbn.setLocationCells(locations);
        
        boolean isAlive = true;
        
        while(isAlive == true) {
            String guess = helper.getUserInput("Insira um número (1-6)");
            if (guess == null)
                break;
            
            String result = sbn.checkYourself(guess);
            
            System.out.println(result);
            
            numOfGuesses++;
            if(result.equals("kill")) {
                System.out.println("Conseguiu em " + numOfGuesses + " tentativas.");
                isAlive = false;
            }
        }
    }
    
}
