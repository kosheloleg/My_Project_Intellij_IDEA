package week6.lesson12;

import com.sun.org.apache.xpath.internal.SourceTree;

//Task 1. Написать метод, проверяющий, является ли строка числом. Воспользоваться Integer. valueOf( str ).
//        Если строка не число, то метод должен кидать исключение NullPointerException.
public class Task1 {

    public static void main(String[] args) {

        try {
        Integer k= Integer.valueOf("asd");}
        catch (NumberFormatException e){

            System.out.println("Передан не верный формат");
            throw new NullPointerException("Ой ой");

        }

    }
}
