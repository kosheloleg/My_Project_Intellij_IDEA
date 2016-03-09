package week7.lesson13;

import java.io.*;
import java.util.ArrayList;


public class Task1 {

    public static void OutFile(String nameFile) throws IOException {

        InputStream is = new FileInputStream(nameFile);
        Integer k;

        ArrayList<Integer> arrInt = new  ArrayList<Integer>();

        String str="";


        int codeChar = 100;
        while(codeChar > -1){
            codeChar = is.read();

            if (codeChar!=32 & codeChar!=10 & codeChar!=13 & codeChar!=-1){

                str = str+ (char)codeChar;

            }
            else {

                if (!str.equals("")){

                k = Integer.valueOf(str);

                k=k*2;

                  arrInt.add(k);

                str = "";}
            }

        }

        if (str!=""){

            k = Integer.valueOf(str);

            arrInt.add(k);

        }


        System.out.println(arrInt.toString());

    }


}
