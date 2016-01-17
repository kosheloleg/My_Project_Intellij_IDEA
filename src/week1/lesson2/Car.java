package week1.lesson2;
import week2.lesson3.Track;

/**
 * Created by Koshel on 17.01.2016.
 */
public class Car {

    String number;
    String color;
    int countHuman=0;
    boolean working=false;
    int speed;

    private Track track;

    public Car(String number, String color, Track track){

        this.setTrack(track);
        this.setColor(color);
        this.setNumber(number);

    }

    public Car(String number, String color){

        this(number,color,null);

    }

    public Car(String number){

        this(number,"",null);

    }

    public void setTrack(Track track){

        if (this.track==null){

            this.track = track;
            track.setCar(this);

            System.out.println("Прицеп к машине прикреплен");

        } else System.out.println("Прицеп нельзя прикрепить потому что уже прикреплен прицеп");

    }

    public void unSetTrack(){

        if (this.track != null){

            track.unSetCar();
            this.track = null;


            System.out.println("Прицеп от машины откреплен");

        } else  {

            System.out.println("Неля открепить прицеп так как она уже откреплен");
        }


    }


    public void printAboutMe(){

        System.out.println("Номер: "+number+", "+ "Цвет: "+color+" Кол. людей в машине "+countHuman+". Скорость машины "+speed+". Заведена:"+working);

    }


    public String getNumber(){

        return number;

    }

    public void setNumber(String number){

        this.number = number;

    }

    public void setColor(String color){

        if (color.equals("Red") ||
                color.equals("Black") ||
                color.equals("White"))
            this.color = color;
    }

    public String getColor(){

        return color;

    }

    public void add(int countHuman){

        if ((this.countHuman+countHuman)>0) {

            this.countHuman+=countHuman;}

    }

    public void start(){

        if (speed==0) {

            if (working) {System.out.println("Машина уже заведена");}
            else working = true; System.out.println("Машина завелась!");

        } else
        {System.out.println("Машина с номером "+number+" не может стартонуть потому что она уже в движении");}




    }

    public void move(int changeSpeed){

        if (working) {speed+=changeSpeed; System.out.println("Машина увеличила скорость на "+changeSpeed);}
        else System.out.println("Машина не может начать движение потому что у нее не работающий двигатель");;


    }

    public void stop(){

        if (speed==0){System.out.println("Машина не может остановится потому что она уже стоит");}
        else
        {speed=0;
            System.out.println("Машина остановилась");
        };

    }

    public void off(){

        if (working){working=false; System.out.println("Двигатель отключился");}
        else {System.out.println("Двигатель уже не работающий");}

    }



}
