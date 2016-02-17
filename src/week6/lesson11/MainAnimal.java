package week6.lesson11;

public class MainAnimal {

    public static void main(String[] args) {

        Dog  dog =  new Dog();
        dog.say();

        Cat cat = new Cat();
        cat.say();

        Lion lion = new Lion();
        lion.say();


    }


}


class Dog extends Animal<Dog>{

    public Dog() {

    }
}

class Lion extends Animal<Lion>{

    public Lion() {

    }

}

class Cat extends Animal<Cat>{

    public Cat() {

    }

}