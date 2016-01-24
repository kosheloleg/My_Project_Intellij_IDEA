package week3.lesson6.ExamplePhoneMaxim;

/**
 * Created by Oleg on 24.01.2016.
 */
public class IPhone4 extends IPhone{

    public IPhone4(String number) {
        super(number);
    }
    @Override
    public void printModel() {
        System.out.println("IPhone4 printModel(): "+this.getClass().getSimpleName());
    }
}