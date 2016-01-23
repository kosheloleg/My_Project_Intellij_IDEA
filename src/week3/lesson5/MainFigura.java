package week3.lesson5;

/**
 * Created by Koshel on 23.01.2016.
 */
public class MainFigura {

    public static void main(String[] args){

        System.out.println("Это прямоугольник");
        Rectange rect = new Rectange(1,2,3,4);
        System.out.println(rect.getPerimetr());
        System.out.println(rect.getSquare());

        System.out.println();

        System.out.println("Это круг");
        Circle circle = new Circle(1,2,3);
        System.out.println(circle.getPerimetr());
        System.out.println(circle.getSquare());

        System.out.println();

        System.out.println("Это треугольник");
        Triangle triangle = new Triangle(1,2,3,4);
        System.out.println(triangle.getPerimetr());
        System.out.println(triangle.getSquare());

        System.out.println();

        System.out.println("Это квадрат");
        Square square = new Square(1,2,3);
        System.out.println(square.getPerimetr());
        System.out.println(square.getSquare());

    }
}





