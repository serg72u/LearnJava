//:object/LearnJava.java
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package learnjava;
import java.util.*;
import static net.mindview.util.Print.*;
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
        System.out.println("st1.i: " + StaticTest.i);
        System.out.println("st2.i: " + StaticTest.i);
        
        Incrementable inc = new Incrementable();
        Incrementable.increment();
        System.out.println("После увеличения:");
        System.out.println("st1.i: " + StaticTest.i);
        System.out.println("st2.i: " + StaticTest.i);
        
        System.out.println("Приметивный тип int преобразован в класс: ");
        Integer int_i = 100;
        System.out.println("Переменная i - создана как класс типа Integer и преобразована в тип String с помощю метода toString() i = " + int_i.toString());
        
        System.out.println("arg1: " + args[0] + " arg2: " + args[1] + " arg3: " + args[2]);
        
        print("Привет, сегодня: ");
        print(new Date());
        
        FloatTank tank1 = new FloatTank();
        FloatTank tank2 = new FloatTank();
        
        tank1.speed = (float) 10.23;
        tank2.speed = (float) 25.10;
        
        print("1. tank1.speed: " + tank1.speed + " tank2.speed: " + tank2.speed);
        tank1 = tank2;
        print("2. tank1.speed: " + tank1.speed + " tank2.speed: " + tank2.speed);
        tank1.speed = (float) 15.25;
        print("3. tank1.speed: " + tank1.speed + " tank2.speed: " + tank2.speed);
        
        TankSpeed speed = new TankSpeed();
        TankSpeed.up(tank1);
        print("4. tank1.speed: " + tank1.speed + " tank2.speed: " + tank2.speed);
        
        int t = 2, d = 100;
        int s;
        s = d/t;
        print(" Скорость, при расстоянии " + d + " и времени " + t + " будет равна: " + s + " км/ч");
        
        Dog dog1 = new Dog();   
        Dog dog2 = new Dog();
        
        dog1.setName("spot");
        dog1.setSays("wof, wof");
        dog2.setName("scruffy");
        dog2.setSays("raw, raw");
        print("Dog 1 is name: " + dog1.getName() + " it says: " + dog1.getSays());
        print("Dog 2 is name: " + dog2.getName() + " it says: " + dog2.getSays());
        
        Dog dog3 = new Dog();
        dog1 = dog3;
        
        print("dog1 == dog3: " + (dog1 == dog3));
        print("dog1.equals(dog3): " + dog1.equals(dog3));
        print("dog1.equals(dog2): " + dog1.equals(dog2));
        
        Coin coin = new Coin();
        for (int j = 0; j < 10; j++) {
             coin.throwCoin();
             print(coin.getCoin());
        }
        
        long l1 = 0xffffffff;
        print("l1: " + Long.toBinaryString(l1));
        long l2 = 0177;
        print("l2: "+ Long.toBinaryString(l2));
        
        float expFloat;// = 1.39e-45f;
        expFloat = 1.39e-45f;
        System.out.println("expFloat = " + expFloat);
        double expDouble = 47e47d;
        double expDouble1 = 47e47;
        System.out.println("expDouble = " + expDouble);
        System.out.println("expDouble1 = " + expDouble1);
        System.out.println("e = " + Math.E);
        System.out.println("pi = " + Math.PI);
            
        float maxFloat;
        maxFloat = 1e38f;
        System.out.println("maxFloat = " + maxFloat);
        float minFloat;
        minFloat = 1e-45f;
        System.out.println("minFloat = " + minFloat);
        
        double maxDouble;
        maxDouble = 1e308d;
        System.out.println("maxDouble = " + maxDouble);
        double minDouble;
        minDouble = 1e-323d;
        System.out.println("minDouble = " + minDouble);
        
        //Поразрядные операторы
        int b1 = 0xfefeffff;
        int b2 = 0xfefefefe;
        
        System.out.println("b1:    " + Integer.toBinaryString(b1));
        System.out.println("b2:    " + Integer.toBinaryString(b2));
        
        System.out.println("b1&b2: " + Integer.toBinaryString(b1&b2));
        System.out.println("b1|b2: " + Integer.toBinaryString(b1|b2));
        System.out.println("b1^b2: " + Integer.toBinaryString(b1^b2));
        System.out.println("~b1:   " + Integer.toBinaryString(~b1));
        
        //Операторы сдвига
        System.out.println("Сдвиг в право");
        int i1;
        i1 = -2147483648;
        for (int j = 0; j < 32; j++) {
            
            System.out.println(j + ". " + Integer.toBinaryString(i1>>j));
            
        }
        
        System.out.println("Сдвиг в лево");
        int i2;
        i2 = 0b11111111111111111111111111111111;
        for (int j = 0; j < 32; j++) {
            
            System.out.println(j + ". " + Integer.toBinaryString(i2<<j));
            
        }
        
        //Задание 13 вывод char в двоичном формате
        printBinaryChar('a');
        printBinaryChar('b');
        printBinaryChar('c');
        printBinaryChar('я');
        printBinaryChar('1');
        
        //Задание 14
        allCompare("Test", "Test1");
        allCompare("Word", "World");
        allCompare("a", "b");
        
        /**Задание 15
        * Вывести числа от 1 до 100
        */
        OneToHandert oth = new OneToHandert();
        oth.OneToHandert();
        
        /**
         * Задание 16
         * Сгенерировать 25 случайных чисел типа int и сравнить с другим случайно сгенерированным числом 
         */
        
        int num1, num2;
        Random rand = new Random(47);
        for (int i = 0; i < 25; i++) {
            num1 = rand.nextInt();
            num2 = rand.nextInt();
            
            if(num1 > num2){
                System.out.println("num1: " + num1 + " больше чем num2: " + num2);
            }else if(num1 < num2){
                System.out.println("num1: " + num1 + " меньше чем num2: " + num2);
            }else 
                System.out.println("num1: " + num1 + " равно num2: " + num2);
            
        }
        
        /**
         * Задание 17
         * изменить задание 2 на выполнение в бесконечном цикле
         * 
         */
        
//        while (true) {            
//            num1 = rand.nextInt();
//            num2 = rand.nextInt();
//            
//            if(num1 > num2){
//                System.out.println("num1: " + num1 + " больше чем num2: " + num2);
//            }else if(num1 < num2){
//                System.out.println("num1: " + num1 + " меньше чем num2: " + num2);
//            }else 
//                System.out.println("num1: " + num1 + " равно num2: " + num2);
//        }
    }
    
    static void printBinaryChar (char c){
        
        int codeInt;
        codeInt = c;
        
        print("Символ: " + c + " в двоичном формате " + Integer.toBinaryString(codeInt));
    }
    
    /**Задание 14
     * Написать метод, который получает два аргумента Sring, выполняет с ними все операции логических сравнений и выводит результат.
     * Для операций == и != так же выполнить проверку equals(). Вызвать метод из main() для нескольких разных объектов String.
     */
    static void allCompare (String s1, String s2){
        print("Сравнение: " + s1 + " и " + s2);
        print("s1 == s2 is " + s1 == s2);
        print("s1 != s2 is " + s1 != s2);
        print("s1.equals(s2) is " + s1.equals(s2));
         
    }
    
   
            
}///:~
