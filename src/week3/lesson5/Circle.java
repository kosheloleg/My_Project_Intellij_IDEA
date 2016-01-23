package week3.lesson5;

/**
 * Created by Koshel on 23.01.2016.
 */
public class Circle extends Figura {


    public Circle(double x,double y,double a){

        super(x,y,a);

    }

    @Override
    public double getPerimetr(){

        return 2*Math.PI*getSideA();

    }

    @Override
    public double getSquare(){

        return Math.PI*Math.pow(getSideA(),2);

    }


}
