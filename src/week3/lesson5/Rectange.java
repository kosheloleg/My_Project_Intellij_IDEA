package week3.lesson5;

/**
 * Created by Koshel on 23.01.2016.
 */
public class Rectange extends Figura{

    private double sideB;

    @Override
    public double getPerimetr(){

        return (sideB+getSideA())*2;

    }

    @Override
    public double getSquare(){

        return getSideA()*getSideB();

    }



    public Rectange(double x,double y,double a,double b){

        super(x,y,a);
        sideB = b;

    }

    public double getSideB() {
        return sideB;
    }

    public void setSideB(double sideB) {
        this.sideB = sideB;
    }
}
