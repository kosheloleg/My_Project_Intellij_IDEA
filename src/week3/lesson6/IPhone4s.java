package week3.lesson6;

/**
 * Created by Oleg on 24.01.2016.
 */
public class IPhone4s extends IPhone {

    @Override
    public void printModel(){

        System.out.println("Я айфон4");

    }

    public IPhone4s(String number, int appleID){

        super(number,appleID);

    }
}
