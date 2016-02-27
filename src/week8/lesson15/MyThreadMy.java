package week8.lesson15;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;


public class MyThreadMy {

    public static void main(String[] args) {

        SecondThread obj1 = new SecondThread("outCurentTime");

        Scanner sc = new Scanner(System.in);
        obj1.setDaemon(true);
        obj1.start();

        if (sc.hasNextLine()){

            obj1.interrupt();

        }



    }

}

class SecondThread extends Thread{
    private String name;
    public SecondThread(String n){
        name = n;
    }
    @Override
    public void run(){

        while (true) {

            if (isInterrupted()) break;

            Date date = new Date();
            SimpleDateFormat simpleDateFormat = new SimpleDateFormat("mm:ss");
            System.out.println(simpleDateFormat.format(date));

            try {
                sleep(4000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

}
