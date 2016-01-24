package week3.lesson6.ExamplePhoneMaxim;

/**
 * Created by Oleg on 24.01.2016.
 */
public abstract class IPhone extends Phone{
    private int appleId;
    private static int countAppleId = 10;

    public IPhone(String number) {
        super(number);
        this.appleId = ++countAppleId;
    }

    public void printAppleId(){
        System.out.println("IPhone printAppleId(): appleId = " + appleId);
    }
}