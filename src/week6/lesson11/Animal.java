package week6.lesson11;

//Task 3. Написать класс животное, где тип животного Animal передается дженериком.
//        Для класса реализовать метод say(выводит на экран сообщение):
//        Кошка Cat говорит "мяу"
//        Собака Dog говорит "гав"
//        Лев Leo говорит "рррр"


public class Animal<T> {

    Animal(){


    }

//    T obj;
//
//    Animal(T obj){
//
//        this.obj = obj;
//
//    }
//
//    Animal(){
//
//
//    }
//
//
//
//    T getObject(){
//
//        return obj;
//    }


    public void say(){

        Dog dog = new Dog();
        Lion lion = new Lion();
        Cat cat = new Cat();


        if (this.getClass()==dog.getClass()){

            System.out.println("Гав");

        }

        if (this.getClass()==lion.getClass()){

            System.out.println("РРРРРР");

        }

        if (this.getClass()==cat.getClass()){

            System.out.println("Мяяяяу");

        }




    }


}
