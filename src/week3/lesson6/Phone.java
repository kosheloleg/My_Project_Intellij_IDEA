package week3.lesson6;

/**
 * Created by Koshel on 24.01.2016.
 */
public abstract class Phone {

    String number;
    boolean camera;
    int sideSize;

    void call(Phone ph) {

        printModel();
        System.out.println("звоню на");
        ph.printModel();

    }

    public Phone(String number,boolean camera,int sideSize){

        this.number = number;
        this.camera = camera;
        this.sideSize = sideSize;

    }

    void printModel(){}

}
