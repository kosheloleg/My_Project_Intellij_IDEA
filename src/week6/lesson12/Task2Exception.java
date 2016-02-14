package week6.lesson12;

//Task 2. Написать метод, проверяющий, существует ли файл с определенным именем.(Можно использовать FileReader Scanner).
//        Если файла нет, то метод кидает исключение ArithmeticException.

import java.io.FileNotFoundException;
import java.io.FileReader;


public class Task2Exception {



    public static void main(String[] args) throws Exception {

        try {
        FileReader fr = new FileReader("Cdferger");
        }
        catch (FileNotFoundException e){

           throw new ArithmeticException("Печаль");

        }

    }




}
