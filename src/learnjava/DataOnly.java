/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package learnjava;

/**
 *
 * @author Sergey Utkin
 */
public class DataOnly {
    int arg1;
    int arg2;
    int arg3;
    
    /**
     *
     * @param a1 аргумент 1
     * @param a2 аргумент 2
     * @param a3 аргумент 3
     */
    public void setData(int a1, int a2, int a3){
       
        arg1 = a1;
        arg2 = a2;
        arg3 = a3;
        
    }
      
    /**
     *
     * @return Возвращается сумма полей класса
     */
    public int getSum(){
     
        return (arg1 + arg2 + arg3);
        
    }
    
    /**
     *
     * @param s Текстовая строка
     * @return Длина строки увеличенная в 2 раза
     */
    public int storage(String s){
        return s.length() * 2;
        
    }
}
