package week3.lesson6;


public abstract class Phone {

    String number;
    boolean camera;
    int sideSize;

    void call(Phone ph) {

        printModel();
        System.out.println("звоню на");
        ph.printModel();

    }

    public Phone(String number){

        this.number = number;


    }

    abstract void printModel();

}
