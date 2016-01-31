package week4.lesson7;


public abstract class AbstractTable implements Tablable {

    boolean isDry;

    private int number;

    private static int lastnumber;

    public boolean isDry(){

        return isDry;
    }

    public AbstractTable(){

       setNumber();

    }

    public int getNumber() {
        return number;
    }

    public void setNumber() {
        number = lastnumber++;
    }

    public void printAboutMe(){

        System.out.println("Я стол №"+getNumber()+ (isDry()? " мокрый":" сухой"));

    }

}
