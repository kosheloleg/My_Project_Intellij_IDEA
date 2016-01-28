package week3.HomeWork;

public class Fish extends Product {

    String poroda;


    public Fish(String barcode,String poroda){

        super(barcode);
        setType(poroda);

    }

    public void swim(){

        System.out.println("Я плыву");

    }

    void cannibalism(Fish fish){

        System.out.println("Я "+this+" поедаю "+fish);

    }

    public void setType(String poroda){

        this.poroda = poroda;

    }

    @Override
    public String toString(){

        return "Я рыба семейства "+poroda;

    }

}
