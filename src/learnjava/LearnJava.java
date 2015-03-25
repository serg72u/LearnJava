//:object/LearnJava.java
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package learnjava;

/**
 * Класс уроков 
 * @author Utkin Sergey
 * @author serg72u@gmail.com
 * @version 1.0
 * Список:
 * <ol>
 * <li> Пункт первый
 * <li> Пункт второй
 * <li> Пункт третий
 * </ol>
 */
public class LearnJava {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Vo1 vo1 = new Vo1();
        System.out.println("Инициализация по умолчанию.");
        System.out.println("Поле i класса Vo1: " + vo1.i);
        System.out.println("Поле c класса Vo1: " + vo1.c);
        
        HelloWorld hw = new HelloWorld();
        hw.HelloWorld();
        
        ATypeName atn = new ATypeName();
        System.out.println(atn.aTypeClass(hw));
        
        DataOnly dataOnly = new DataOnly();
        dataOnly.setData(10, 15, 20);
        System.out.println(dataOnly.getSum());
        System.out.println(dataOnly.storage("Hello, World"));
                
        StaticTest st1 = new StaticTest();
        StaticTest st2 = new StaticTest();
        System.out.println("st1.i: " + st1.i);
        System.out.println("st2.i: " + st2.i);
        
        Incrementable inc = new Incrementable();
        Incrementable.increment();
        System.out.println("После увеличения:");
        System.out.println("st1.i: " + StaticTest.i);
        System.out.println("st2.i: " + StaticTest.i);
        
        System.out.println("Приметивный тип int преобразован в класс: ");
        Integer i = 100;
        System.out.println("Переменная i - создана как класс типа Integer и преобразована в тип String с помощю метода toString() i = " + i.toString());
        
        System.out.println("arg1: " + args[0] + " arg2: " + args[1] + " arg3: " + args[2]);
        
                
    }
    
}///:~
