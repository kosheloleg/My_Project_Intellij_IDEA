package HomeWork_NewYear;

/**
 * Created by Oleg on 03.01.2016.
 */
public class MainLift {

  public static void main(String[] args){

      Lift lift = new Lift(5,16);



      lift.move(7,4);
      lift.move(1,4);

      lift.move(7,4);
      lift.move(1,4);

      //Тест

//      lift.move(20,3);
//      lift.move(10,6);

      System.out.println(lift);

  }






}
