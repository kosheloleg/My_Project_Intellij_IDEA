package week3.HomeWork;

public class Product {

    private double price;

    private int storagePeriod;

    private String barcode;

    public Product(String barcode,double price,int storagePeriod){

        this.barcode = barcode;
        this.price = price;
        this.storagePeriod = storagePeriod;

    }

    public Product(String barcode,double price){

        this(barcode,price,0);

    }

    public Product(String barcode){

        this(barcode,0,0);

    }


    public void printPrice(){

        System.out.println("My price is: "+price);

    }

    public void printStoragePeriod(){

        System.out.println("Storage Period: "+storagePeriod);
    }

    public void printBarAndPrice(){

        System.out.println("Цена "+getPrice()+"  BarCode:"+getBarcode() );

    }

    public void setPrice(double price){

        this.price = price;

    }

    private double getPrice(){

        return this.price;

    }

    public int getStoragePeriod() {
        return storagePeriod;
    }

    public void setStoragePeriod(int storagePeriod) {
        this.storagePeriod = storagePeriod;
    }

    public String getBarcode() {
        return barcode;
    }

    public void setBarcode(String barcode) {
        this.barcode = barcode;
    }
}
