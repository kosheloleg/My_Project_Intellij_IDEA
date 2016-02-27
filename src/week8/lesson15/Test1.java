package week8.lesson15;


import java.text.SimpleDateFormat;
import java.util.Date;

public class Test1 {
    public static void main(String[] args) throws InterruptedException {
        MyThread obj = new MyThread();
        obj.start();
        Thread.sleep(4000);
        obj.interrupt();
    }

}

class MyThread implements Runnable{
    Thread thread;
    public MyThread(){
        thread = new Thread(this);
    }
    @Override
    public void run() {
        while(true){
            if(isInterrupted()) break;

            Date date = new Date();
            SimpleDateFormat simpleDateFormat = new SimpleDateFormat("mm:ss");
            System.out.println(simpleDateFormat.format(date));



        }
        System.out.println("end");
    }
    //
    public void start(){
        thread.start();
    }
    public boolean isInterrupted(){
        return thread.isInterrupted();
    }
    public void interrupt(){
        thread.interrupt();
    }

}