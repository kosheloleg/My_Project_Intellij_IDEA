package HomeWork_NewYear;

/**
 * Created by Oleg on 03.01.2016.
 */
public class Vahtersha {

     int countFriends;
     int countOwners;

    Vahtersha(){

        countFriends = 0;
        countOwners=0;
    }


     public void addOwners(int count){

         if ((countOwners+count)<=countFriends){

         countOwners+= count;
         }

         else System.out.println("Будет превышение! Своих будет: "+countFriends+". Чужих будет: "+(countOwners+count));


     }

    public void addFriends(int count){

        countFriends+= count;

    }

    public void removeOwners(int count){

        if (countOwners>=count) {

        countOwners-= count;
        } else {
            System.out.println("Нет такого количества чужих в доме");
        }

    }

    public void removeFriends(int count){

        if (countFriends>=count) {

        if ((countFriends-count)>=countOwners){

            countFriends-= count;
        } else {System.out.println("Не выпущу друзей, потому что друзей будет: "+(countFriends-count)+". Чужих будет: "+countOwners);}


        } else {
            System.out.println("Нет такого количества друзей в доме!");
        }

    }

    public void printInfo(){

        System.out.println("Своих: "+countFriends+".  Чужих: "+countOwners);

    }



}
