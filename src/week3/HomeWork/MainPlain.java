package week3.HomeWork;

public class MainPlain {

    public static void main(String[] args) {

        int[][] beginCoordinates = new int[2][3];

        for (int i=0;i<3;i++){

            for (int j = 0; j<2;j++){

                beginCoordinates[i][j] = (int)(Math.random()*10);

            }

        }



        Plain plain = new Plain("Boing",800,beginCoordinates);


    }
}
