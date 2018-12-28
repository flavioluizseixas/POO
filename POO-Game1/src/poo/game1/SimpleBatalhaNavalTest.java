/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package poo.game1;

/**
 *
 * @author fseixas
 */
public class SimpleBatalhaNavalTest {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        SimpleBatalhaNaval sbn = new SimpleBatalhaNaval();
        
        int[] locations = {2, 3, 4};
        sbn.setLocationCells(locations);
        String userGuess = "2";
        
        String result = sbn.checkYourself(userGuess);
        String testResult = "failed";
        if (result.equals("hit")) {
            testResult = "passed";
        }
        
        System.out.println(testResult);
        
    }
}
