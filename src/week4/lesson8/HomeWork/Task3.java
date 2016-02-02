package week4.lesson8.HomeWork;

//Task3.
//        1) Написать метод, который в качестве параметра принимает имя файла.
//        Метод возвращает двухмерный массив (String): имена переменных и значение.
//
//        В файле набор переменных указаны так:
//        ;v=[156],ghg,hg;m=[12],tytuyr894848;vector=[qwe];
//        Существуют правила форматирования текста в файле:
//        - имя переменной всегда стоит между симвоами ';' и '='
//        - значение переменной всегда идет после знака '=' и заключено в квадратные кавычки
//        - все что идет после квадратных кавычек до ';' являются служебными символами и в данной задаче они игнорируются

import java.io.FileReader;
import java.util.Scanner;

public class Task3 {


    public static void main(String[] args) throws Exception {

        String[][] arr = getVariablesAndValue("Task3");

        for (int i = 0;i<arr.length;i++){

            for (int j=0;j<arr[i].length;j++){

                System.out.println(arr[i][j]);

            }

        }


    }

    public static String[][] getVariablesAndValue(String fileName) throws Exception{

        String[][] strArr = new String[0][0];

        int indexBegin;
        int indexEnd;

        FileReader fr = new FileReader(fileName);

        Scanner sc = new Scanner(fr);

        String s="";

        while (sc.hasNextLine()){

            s = sc.nextLine();

            s = s.substring(1,s.length());

            String[] parts = s.split(";");
            strArr = new String[2][parts.length];



            for (int i=0;i<parts.length;i++){


                if (!parts[i].equals("")) {

                    indexEnd = parts[i].indexOf("=");
                    strArr[0][i] = parts[i].substring(0, indexEnd);

                    //System.out.println(strArr[0][i]);

                    indexBegin = parts[i].indexOf("=[");
                    indexEnd = parts[i].indexOf("]");

                    strArr[1][i] = parts[i].substring(indexBegin+2,indexEnd);

                    //System.out.println(strArr[1][i]);
                }

            }



        }


            return strArr;

    }






}
