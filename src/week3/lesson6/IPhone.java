package week3.lesson6;

public abstract class IPhone extends Phone {

    int appleId;

    void printAppleId(){

        System.out.println("Мой apple ID  "+appleId);

    }


    public IPhone(String number,boolean camera, int sideSize,int appleID){

        super(number,camera,sideSize);
        this.appleId = appleID;

    }

}
