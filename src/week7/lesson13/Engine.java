package week7.lesson13;

import java.io.Serializable;

public class Engine implements Cloneable,Serializable{
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