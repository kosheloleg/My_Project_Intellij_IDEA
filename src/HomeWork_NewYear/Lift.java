package HomeWork_NewYear;

/**
 * Created by Oleg on 03.01.2016.
 */

/**     - текущий этаж curFloor
*       - общее количество этажей перемещения countFloat
*       - общее количество перевезенных людей countPeople
*       - количество людей находящихся в данный момент в доме. currentCountPeople
*/
public class Lift {

    int curFloor;
    int countFloat;
    int countPeople;
    int currentCountPeople;

    int liftingCapacity;
    int countFloorHome;

    public Lift(int liftingCapacity,int countFloorHome){

        curFloor = 1;
        countFloat = 0;
        countPeople = 0;
        currentCountPeople = 0;

        this.liftingCapacity = liftingCapacity;
        this.countFloorHome = countFloorHome;

    }


    public int getCurFloor() {
        return curFloor;
    }

    public void setCurFloor(int curFloor) {
        this.curFloor = curFloor;
    }

    public int getCountFloat() {
        return countFloat;
    }

    public void setCountFloat(int countFloat) {
        this.countFloat = countFloat;
    }

    public int getCountPeople() {
        return countPeople;
    }

    public void setCountPeople(int countPeople) {
        this.countPeople = countPeople;
    }

    public int getCurrentCountPeople() {
        return currentCountPeople;
    }

    public void setCurrentCountPeople(int currentCountPeople) {
        this.currentCountPeople = currentCountPeople;
    }

    public void move(int nextFloor, int countHuman){

        if (nextFloor>countFloorHome) {
            System.out.println("В доме количество этажей: "+countFloorHome+". Потому на "+nextFloor+"-ый этаж не поднимется");
            return;
        }

        if (countHuman>liftingCapacity){

            System.out.println("Грузоподьемность "+liftingCapacity+" человек. Потому нельзя перевести "+countHuman);
            return;

        }

        countFloat +=Math.abs(nextFloor-curFloor);

        if (curFloor==1) {
            currentCountPeople+= countHuman;
        } else if (nextFloor==1){
            currentCountPeople-= countHuman;
        }


        curFloor = nextFloor;
        countPeople+=countHuman;

    }

    @Override
    public String toString(){

        return "Этажность дома: "+countFloorHome+". Грузоподьемность лифта: "+liftingCapacity+"\nТекущий этаж: "+curFloor+".  Общее количество этажей перемещения: "+countFloat+".\n общее количество перевезенных людей: "+countPeople+". Количество людей в доме: "+currentCountPeople;

    }


}
