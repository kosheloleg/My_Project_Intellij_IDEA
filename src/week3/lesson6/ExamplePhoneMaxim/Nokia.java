package week3.lesson6.ExamplePhoneMaxim;

/**
 * Created by Oleg on 24.01.2016.
 */
public class Nokia extends Phone{
    public Nokia(String number) {
        super(number);
    }

    @Override
    public void printModel() {
        System.out.println("Nokia printModel(): "+this.getClass().getSimpleName());
    }

}