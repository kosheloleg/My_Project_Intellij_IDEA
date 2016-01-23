package week3.lesson5;


public class Figura {

    private double xPos;

    private double yPos;

    private double sideA;



    public Figura(double xPos,double yPos,double sideA){

        setxPos(xPos);
        setyPos(yPos);
        setSideA(sideA);


    }

    public Figura(){


    }

    public double getxPos() {
        return xPos;
    }

    public void setxPos(double xPos) {
        this.xPos = xPos;
    }

    public double getyPos() {
        return yPos;
    }

    public void setyPos(double yPos) {
        this.yPos = yPos;
    }

    public double getSideA() {
        return sideA;
    }

    public void setSideA(double sideA) {
        this.sideA = sideA;
    }

    public double getPerimetr(){

        return 0;

    }

    public double getSquare(){

       return 0;
    }
}
