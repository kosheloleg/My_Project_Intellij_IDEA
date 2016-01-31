package week4.lesson7;

public abstract class AbstractGlass implements Glassable {

    public void pourFromMe(){

        System.out.println("Стака выливается");

    }

    abstract public String getInfoForMe();

}
