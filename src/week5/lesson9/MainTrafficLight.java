package week5.lesson9;

/**
 * Created by Koshel on 06.02.2016.
 */
public class MainTrafficLight {

    public static void main(String[] args) {

        TrafficLight tl = new TrafficLight();


        for (int i=0;i<10;i++) {

            System.out.println(tl.getNextColor());

            try {
                Thread.sleep(500);
            } catch (Exception e) {
                e.printStackTrace();
            }

        }

    }

}
