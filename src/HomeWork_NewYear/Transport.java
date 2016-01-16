package HomeWork_NewYear;


/**
 * Created by Oleg on 29.12.2015.
 */
public class Transport {

    String type;
    int maxSpeed;
    int maxCountPassenger;
    int maxHeight;

    public int getMaxHeight() {
        return maxHeight;
    }

    public void setMaxHeight(int maxHeight) {
        this.maxHeight = maxHeight;
    }

    public int getCountPassenger() {
        return maxCountPassenger;
    }

    public void setCountPassenger(int countPassenger) {
        this.maxCountPassenger = countPassenger;
    }

    Transport(String type,int maxCountPassenger,int maxSpeed,int maxHeight){

        this.maxCountPassenger = maxCountPassenger;
        this.maxSpeed = maxSpeed;
        this.type = type;
        this.maxHeight = maxHeight;

    }

    Transport(){

        type = "";
        maxSpeed = 0;
        maxCountPassenger = 0;

    }


    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getSpeed() {
        return maxSpeed;
    }

    public void setSpeed(int speed) {
        this.maxSpeed = speed;
    }
}
