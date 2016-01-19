package week2.lesson3;
import week1.lesson2.Car;

/**
 * Created by Koshel on 17.01.2016.
 */
public class Track {

    private String number;
    private String status;

    private week1.lesson2.Car car;

    public void setCar(Car car){

        if (getCar()==null){

            this.car = car;
            System.out.println("Машина к прицепу прикреплена");

        } else System.out.println("Прицеп уже прикреплен к машине"); ;

    }

    public void unSetCar(){

        this.car = null;
        System.out.println("Машина от прицепа откреплена");

    }

    public Car getCar(){

        return car;
    }

    public void setNumber(String number){

        this.number = number;
    }

    public String getNumber(){

        return this.number ;
    }

    public String getStatus(){

        return this.status ;
    }

    public Track(String number,String status){

        this.number = number;
        this.status = status;

    }

    public Track(String number){

        this(number,"stop");

    }

    public Track(){

        this("","stop");

    }

    public void roll(){

        if (this.status=="moving") {
            System.out.println("Прицеп с номером "+number+" не может начать движение так как он уже двигается");

        } else {

            this.status = "moving";
            System.out.println("Прицеп с номером "+number+" начал движение");

        }


    }

    public void stop(){

        if (this.status=="stop") {

            System.out.println("Прицеп с номером "+number+" не может остановится так как он уже стоит");

        } else {
            this.status = "stop";
            System.out.println("Прицеп с номером "+this.number +" остановлен");

        }



    }

    @Override
    public String toString(){

       return "Номер прицепа: "+number+"    статус: "+status;

    }


}
