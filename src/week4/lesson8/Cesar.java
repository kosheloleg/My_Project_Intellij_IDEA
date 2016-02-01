package week4.lesson8;

import java.io.FileReader;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.Scanner;

public class Cesar {

    public static void main(String[] args) throws Exception {

       FileReader fr = new FileReader("Cesar.txt");

        Scanner sc = new Scanner(fr);
        String s;

        char[] massChar;
        ArrayList<String> stringArr = new ArrayList<String>();


        while (sc.hasNextLine()){

            s = sc.nextLine();

            String stroka;

            massChar = s.toCharArray();
            stroka = "";


            for (char ch:massChar){

                if (ch!=' ')
                stroka += (char)((int)ch+3);

            }

            if (sc.hasNextLine()){
                stroka+="\n";
            }


            stringArr.add(stroka);
        }

        fr.close();


        FileWriter fw = new FileWriter("Cesar.txt");



        for (String str:stringArr){

            fw.write(str);

        }

        fw.close();

    }

}
