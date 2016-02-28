package week8.lesson15;

import java.util.ArrayList;

public class ThreadOleg extends Thread{

    ArrayList<dopPotok> arr = new ArrayList<dopPotok>();

    @Override
    public void run(){


        for (int i=0;i<50;i++){

            dopPotok t = new dopPotok(""+i);
            arr.add(t);

            t.start();
            System.out.println("Запустился поток "+t.name);



        }


        for (dopPotok pot:arr){

            System.out.println("Перечисляем потоки"+pot.name);

        }

        while (true){
            if (isInterrupted()){

                for (dopPotok p:arr){

                    p.interrupt();

                    System.out.println("Остановлен поток "+p.getName());

                }


                    break;

            }



        }

    }


}

class dopPotok extends Thread{

    public String name;


    public dopPotok(String name){

        this.name = name;

    }


    public void run(){

        while (!isInterrupted()) {

            try {
                Thread.sleep(200);

                System.out.println("Работает поток "+name);
            } catch (InterruptedException e) {
                break;
            }
        }
    }

}