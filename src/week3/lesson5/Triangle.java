package week3.lesson5;


public class Triangle extends Rectange {

    public Triangle(double x,double y,double a,double b){

        super(x,y,a,b);

    }

    @Override
    public double getPerimetr(){

        return getSideA()+getSideB();

    }

    @Override
    public double getSquare(){

        return (getSideA()*getSideB())/2;

    }

}
