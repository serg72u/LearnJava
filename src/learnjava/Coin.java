/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package learnjava;

import java.util.Random;

/**
 *
 * @author serg72u
 */
public class Coin {
    static int coin;
    Random rand = new Random(47);
    
    void throwCoin(){
        coin = rand.nextInt(100);
    }
    
    String getCoin(){
        if (coin < 50) {
            return "Орел";
        }
        else {
            return "Решка";
        }
    }
}
