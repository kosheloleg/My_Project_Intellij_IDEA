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

    public Conditioner(){

        this(0);

    }



    public void setIndex(int index){

        this.index = index;

    }

    public void turnOn(){

        isWorking = true;

    }

    public void turnOf(){

        isWorking = false;

    }

    public int getTemperature(){

        return this.temperature;
    }

    public boolean getTurn(){

        return isWorking;
    }
}
