package week3.HomeWork;

/**
 * Created by Oleg on 24.01.2016.
 */
public abstract class Animal {

    String name;

    abstract void say();

    abstract void eat();

    public Animal(String name){

        this.name = name;

    }

    public void printName(){

        System.out.println("My name "+name);

    }

}
