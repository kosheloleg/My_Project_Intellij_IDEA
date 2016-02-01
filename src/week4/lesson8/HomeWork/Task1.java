package week4.lesson8.HomeWork;

import java.io.FileWriter;

class Task1 {
    public static void main(String[] args) throws Exception {
        String sFileName = "file2.txt";
        int k1 = 10;
        int k2 = 30;
        myMethod(sFileName, k1, k2);
    }


    public static void myMethod(String sFileName, int k1, int k2) throws Exception{

        FileWriter fw = new FileWriter(sFileName);


        for (int i=k1;i<k2;i++){

            fw.write(""+i+"\n");


        }

        fw.close();

    }




    }







