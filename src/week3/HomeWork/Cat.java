package week3.HomeWork;


public class Cat extends Animal {

    public Cat(String name){

        super(name);

    }

    @Override
    public void say() {

        System.out.println("Мяу");

    }

    @Override
    public void riseHair() {

        System.out.println("Моя шерсть стала дыбом");

    }

    @Override
    public void yellIfNotGorged() {

        System.out.println("Мяяяяяяяяяяу");

    }
}
