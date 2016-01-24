package week3.lesson5;

public class Conditioner {

    int temperature;

    int index;

    boolean isWorking;

    public void setTemperature(int temperature){

        this.temperature = temperature;

    }

    public Conditioner(int index){

        setIndex(index);


    }

    public void turn(boolean isWorking){

        this.isWorking = isWorking;

    }



    public int getIndex(){

        return this.index;
    }



    public void setIndex(int index){

        this.index = index;

    }

    public void turnOn(){

        turn(true);

    }

    public void turnOff(){

        turn(false);

    }

    public int getTemperature(){

        return this.temperature;
    }

    public boolean getTurn(){

        return isWorking;
    }
}
