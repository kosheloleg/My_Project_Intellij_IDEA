package week4.lesson7;


public class AbstractTable implements Tablable {

    boolean isDry;

    private static int number;

    public boolean isDry(){

        return isDry;
    }

    public AbstractTable(){

        ++number;

    }

}
