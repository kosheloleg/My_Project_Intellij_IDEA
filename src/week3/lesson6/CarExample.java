package week3.lesson6;

/**
 * Created by Oleg on 24.01.2016.
 */
public class CarExample {

        public static void main(String[] args) {
            Carable obj1 = new BigCar();
            Carable obj2 = new SmallCar();
        }
    }
    interface Carable{
        public void start();
        public void move();
        public void stop();
    }
    abstract class AbstractCar implements Carable{
        private String number;
        private int status = 0;//stop 0, start 1, move 2
        @Override
        public void start(){
            if(status==0){
                status=1;
                System.out.println("Car start engine!");
            }
        }
        @Override
        public void move() {
            if(status==1){
                status=2;
                System.out.println("Car move!");
            }
        }
    }
    class BigCar extends AbstractCar{
        @Override
        public void stop() {
            System.out.println("BigCar is stopped!");

        }
    }
    class SmallCar extends AbstractCar{
        @Override
        public void stop() {
            System.out.println("SmallCar is stopped!");
        }
    }

