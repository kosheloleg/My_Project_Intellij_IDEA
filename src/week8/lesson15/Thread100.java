package week8.lesson15;

// Создать 100 потоков, каждый их которых выведет на экран свой номер и дождется, пока его прервут.

import java.util.ArrayList;

public class Thread100 {
    public static void main(String[] args) {

        ArrayList<MyThread100> list = new ArrayList<>();

        for (int i = 0; i < 100; i++) {
            MyThread100 thr = new MyThread100();
            thr.start();
            list.add(thr);
        }

        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        for (MyThread100 myThread : list) {
            myThread.interrupt();
        }
    }
}

class MyThread100 extends Thread{

    @Override
    public void run() {
        System.out.println(getId() + "started");

        while (! isInterrupted()) {

            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                System.out.println(getId() + "interrupted");
                return;
            }
        }
    }
}