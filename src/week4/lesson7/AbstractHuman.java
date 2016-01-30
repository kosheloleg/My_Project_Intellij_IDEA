package week4.lesson7;


public class AbstractHuman implements Humanable {

    private AbstractGlass glass;

    private AbstractTable table;

    public void takeGlass(AbstractGlass glass){

        System.out.println("Я "+this.toString()+" беру стакан "+glass.toString());
        this.glass = glass;
    }
    public void putGlass(){

        System.out.println("Я "+this+" ставлю стакан "+glass);

    }
    public void pourWaterOnTable(AbstractTable table){

        System.out.println("Выливается вода из стакана на стол");

        table.isDry = true;

    }
    public void fillGlass(){

        System.out.println("Запоняется стакан "+glass);

    }

     public void printAboutMe(){

    }

}
