package week8.lesson15;

public class MyThreadOleg {



    public static void main(String[] args) {


        ThreadOleg potok = new ThreadOleg();

        //potok.setDaemon(false);
        potok.start();

        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {

        }

        potok.interrupt();

    }






}
