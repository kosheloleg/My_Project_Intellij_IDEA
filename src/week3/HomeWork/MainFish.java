package week3.HomeWork;

public class MainFish {

    public static void main(String[] args) {

        Fish fish = new Fish("fwef223","цыхлида");

        Fish fish2 = new Fish("fаа4е3","неоны");

        fish.printPrice();
        fish.printStoragePeriod();
        fish.swim();
        fish.cannibalism(fish2);

        fish.printBarAndPrice();



    }


}
