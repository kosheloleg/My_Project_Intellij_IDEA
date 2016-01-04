package OOP;

/**
 * Created by Oleg on 03.01.2016.
 */
public class Bus extends Transport {

    int countHuman;


    public Bus(String type,int maxCountPassenger,int maxSpeed){

        super(type,maxCountPassenger,maxSpeed,0);

        this.countHuman = 0;
    }

    @Override
    public String toString(){

        return "Тип: "+type+". Максимальное количество пасажиров: "+maxCountPassenger+". Текущее количество пасажиров: "+countHuman;

    }

    public void addHuman(int countHuman){

        if ((this.countHuman+countHuman)>maxCountPassenger){

            System.out.println("Будет превышено маскимальное количество пасажиров. Будет:"+(this.countHuman+countHuman));
        }
        else if ((this.countHuman+countHuman)<0){

            System.out.println("Количество в автобусе будет отрицательным. Будет:"+(this.countHuman+countHuman));
        } else {

            this.countHuman+=countHuman;
        }

    }

}
