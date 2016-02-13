package week3.HomeWork;


public abstract class Animal {

    private String name;

    protected abstract void say();
    protected abstract void riseHair();
    protected abstract void yellIfNotGorged();


    public Animal(String name){

        this.name = name;

    }

    public void printName(){

        System.out.println("My name "+name);

    }

    public void eat(){

        System.out.println("Я ем");

    }

}
