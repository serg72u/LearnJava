/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package learnjava;

/**
 *
 * @author serg72u
 */
public class Dog {
    private String name;
    private String says;
    
   public void setName (String n){
       name = n;
   }
   
   public void setSays (String s){
       says = s;
   }
   
   public String getName (){
       return name;
   }
   
   public String getSays (){
       return says;
   }
}
