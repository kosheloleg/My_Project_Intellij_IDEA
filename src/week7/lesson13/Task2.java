package week7.lesson13;

//Task 2. Запросить у пользователя число. Определить это целое число, дробное число или не число.
//        (InputStreamReader и BufferedReader, без Scanner)

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.Reader;
import java.util.ArrayList;


public class Task2 {

    public static void main(String[] args) throws IOException {

        ArrayList<String> arr = new ArrayList<String>();
        arr.add("1");
        arr.add("2");
        arr.add("3");
        arr.add("4");
        arr.add("5");
        arr.add("6");
        arr.add("7");
        arr.add("8");
        arr.add("9");
        arr.add("0");
        arr.add(".");

        Reader isr = new InputStreamReader(System.in);
        BufferedReader d = new BufferedReader(isr);

        String s = d.readLine();

        char[] arrCh= s.toCharArray();

        int kolTochek = 0;

        for (char c:arrCh){

            if (!arr.contains(String.valueOf(c))){

                System.out.println("Это не число");
                return;
            }

            if (c=='.'){

                kolTochek++;

            }


        }


        if (kolTochek==0) {
            System.out.println("Это целое число");

        } else if (kolTochek==1){ System.out.println("Это дробное число"); }
        else if (kolTochek>1){ System.out.println("Это не число"); }







    }

}
