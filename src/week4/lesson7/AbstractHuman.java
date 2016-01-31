package week4.lesson7;


public abstract class AbstractHuman implements Humanable {

    private AbstractGlass glass;

    //private AbstractTable table;

    public void takeGlass(AbstractGlass glass){

        this.glass = glass;
    }
    public void putGlass(){

        System.out.println("Я "+this+" ставлю стакан "+glass);

    }
    public void pourWaterOnTable(AbstractTable table){

        if (glass!=null){

        System.out.println("Выливается вода из стакана "+this.glass.getInfoForMe()+" на стол №"+table.getNumber());

        table.isDry = true;}

        else System.out.println("Не стакана в руках");


    }
    public void fillGlass(){

        System.out.println("Запоняется стакан "+glass);

    }

    public AbstractGlass getGlass() {
        return glass;
    }

    public void setGlass(AbstractGlass glass) {
        this.glass = glass;
    }


    abstract public void printAboutMe();

}
