package week3.HomeWork;

public class Plain extends Wing{

    String type;

    int[][] beginCoordinates;
    int[][] endCoordinates;

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int[][] getBeginCoordinates() {
        return beginCoordinates;
    }

    public void setBeginCoordinates(int[][] beginCoordinates) {
        this.beginCoordinates = beginCoordinates;
    }

    public Plain(String type, int fuel, int[][] beginCoordinates){

        super(fuel);
        setType(type);
        setBeginCoordinates(beginCoordinates);

    }

    public Plain(String type, int fuel){

        this(type,fuel,null);

    }

    public Plain(String type){

        this(type,0,null);

    }

    public void takeoff(){

        if (fuelEnough()) System.out.println("Взлетаем");
        else System.out.println("Не достаточно топлива. Не хватает "+(1000-getFuel()));

    }

    public void selectRoute(int[][] coordinates){

        this.endCoordinates = coordinates;

    }

    public void printRoute(){

        System.out.println("Мы летим с точки "+beginCoordinates.toString()+" в точку "+endCoordinates.toString());

    }


}
