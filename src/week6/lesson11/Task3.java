package week6.lesson11;

//Task 3. Написать класс животное, где тип животного Animal передается дженериком.
//        Для класса реализовать метод say(выводит на экран сообщение):
//        Кошка Cat говорит "мяу"
//        Собака Dog говорит "гав"
//        Лев Leo говорит "рррр"



public class Task3 {

    public static void main(String[] args) {

        //SayAnimal<Cat> cat = new SayAnimal<Cat>();

        //cat.say();

    }

    static class Animal{}
    static class Dog extends Animal{}


    static class SayAnimal<T extends Animal>{


        public void say(){

            T animal;

            Dog dog = new Dog();




//            if (animal.getClass() == cat.getClass() ){
//
//                System.out.println("Мяу");
//
//            }




        }



    }




}
