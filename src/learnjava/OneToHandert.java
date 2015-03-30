/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package learnjava;

/**
 * Вывести чиста от 1 до 100
 * @author serg72u
 */
public class OneToHandert {
   
    public void OneToHandert() {
        int result = 0;
       for (int i = 0; i < 10; i++) {
           System.out.println("");
           for (int j = 0; j < 10; j++) {
               result = i*10 + j;
               
                   
                   if (result <= 99) {
                       System.out.print(result + ", "); 
               } else {
                       return;
               }
           }
       }
        System.out.println("");
        System.out.println("100.");
   }
}
