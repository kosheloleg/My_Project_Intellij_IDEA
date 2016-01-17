package week1.lesson2;

import week2.lesson3.Track;

public class MainCar {

    public static void main(String[] args){

        Car car = new Car();
        Track track = new Track("767878","stop");

        car.setTrack(track);

        car.setTrack(track);

        car.unSetTrack();
        car.unSetTrack();

//		Car car2 = new Car();
//
//		car1.number = "АА 1111";
//		car1.color = "green";
//
//		car2.number = "BB 2222";
//		car2.color = "red";
//
//        car1.setNumber("????????????");
//        car1.setColor("Black");



//        for(int i =0;i<10;i++){
//            int k = (int)(3*Math.random());
//            if(k==0) car1.start();
//            else if(k==1) car1.move(30);
//            else car1.stop();
//            car1.printAboutMe();
//            System.out.println();
//        }



    }

}
