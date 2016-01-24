package week3.lesson6;

public abstract class IPhone extends Phone {

    private int appleId;


    void printAppleId(){

        System.out.println("Мой apple ID  "+appleId);

    }


    public IPhone(String number,int appleID){

        super(number);
        this.appleId = appleID;

    }

}
