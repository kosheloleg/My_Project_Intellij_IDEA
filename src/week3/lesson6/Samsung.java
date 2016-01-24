package week3.lesson6;

/**
 * Created by Koshel on 24.01.2016.
 */
public class Samsung extends Phone {


    public Samsung(String number){

        super(number);
    }

    public String getModel(){

       return "Я самсунг ";

    }

    public void printModel(){

        System.out.println(getModel());

    }


}
