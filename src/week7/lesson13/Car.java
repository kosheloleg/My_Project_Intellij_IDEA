package week7.lesson13;


public class Car implements Cloneable{
    private int countWheel = 4;
    private String number;
    private Engine engine;

    public static void main(String[] args) throws CloneNotSupportedException {
        Engine engine1 = new Engine("35178547");
        Car car1 = new Car(4, "AA 1111", engine1);
        Car car2 = car1.clone();

        System.out.println("1:"+car1);
        System.out.println("2:"+car2);System.out.println();

        car1.setCountWheel(5);
        car1.setNumber("BB 2222");engine1.setNumber("qwerty");

        System.out.println("1:"+car1);
        System.out.println("2:"+car2);System.out.println();

        if(car1.getEngine() == car2.getEngine())
            System.out.println("двигатель на двоих");
        else
            System.out.println("у авто свои двигатели");

    }
    @Override
    public Car clone() throws CloneNotSupportedException{
        Car car1 = (Car)super.clone();

        car1.setEngine(car1.engine.clone());

        return car1;
    }
    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public Engine getEngine(){

        return this.engine;
    }

    public void setEngine(Engine eng){

        this.engine = eng;
    }

    public int getCountWheel() {
        return countWheel;
    }

    public void setCountWheel(int countWheel) {
        this.countWheel = countWheel;
    }

    public Car(int countWheel, String number, Engine eng) {
        this.countWheel = countWheel;
        this.number = number;
        engine = eng;
    }

    @Override
    public String toString() {
        return "Car [countWheel=" + countWheel + ", number=" + number +", eng="+ engine.getNumber()+"]";
    }

}

class Engine implements Cloneable{
    private String number;

    public Engine(String number) {
        super();
        this.number = number;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    @Override
    public String toString() {
        return "Engine [number=" + number + "]";
    }

    @Override
    public Engine clone() throws CloneNotSupportedException{
        Engine engine1 = (Engine)super.clone();

        return engine1;
    }

}