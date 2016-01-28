package week3.HomeWork;

public class Wing {

    int fuel;

    public boolean fuelEnough(){

        return (fuel>1000)? true:false;

    }

    public Wing(int fuel){

        setFuel(fuel);

    }

    public int getFuel() {
        return fuel;
    }

    public void setFuel(int fuel) {
        this.fuel = fuel;
    }
}
