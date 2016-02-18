package week6.lesson12;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.GregorianCalendar;


//Task1. Написать класс Product у которого есть поля:
//        name,price, дата покупки.
//        с изначальной сортировкой по наименованию.
//        Пусть продукт выводится на экран: Морковка цена дата
//        Реализовать возможность отсортировать список:
//        - по цене
//        - по дате закупки
//        В mainProduct:
//        создать 10 продуктов.
//        с разной датой закупки и разной ценой.
//        Вывести список без сортировки
//        Отсортировать список и вывести на экран
//        Отсортировать список по цене и вывести на экран
//        Отсортировать список по дате закупки и вывести на экран

    public class Product  implements Comparable{
        private String name;
        private double price;
        private Calendar date;

        public String getName(){
            return name;
        }
        public double getPrice(){
            return price;
        }
        public Calendar getDate(){
            return date;
        }

        public Product (String name,double price,Calendar date) throws PriceException,DateException{
            setName(name);
            setPrice(price);
            setDate(date);
        }
        @Override
        public int compareTo(Object obj) {
            Product product = (Product)(obj);
            return this.getName().compareTo(product.getName());
        }
        @Override
        public String toString(){
            SimpleDateFormat format = new SimpleDateFormat("dd.MM.yyyy");
            return name + " " + price + "            " + format.format(date.getTime()) + "\n";
        }
        @Override
        public boolean equals(Object obj){
            Product product = (Product)(obj);
            return this.getName().equals(product.getName());
        }

        public void setPrice(double price) throws PriceException{

            if (price<0)




               throw new PriceException("Цена не может быть отрицательной");




            else this.price = price;
        }

        public void setName(String name){

            this.name = name;
        }

        public void setDate(Calendar date) throws DateException{

            Calendar yesterYear = new GregorianCalendar(2016,01,01);

            if (date.before(yesterYear)){

                throw new DateException("Дата покупки не может быть прошлогодней!");

            }


            else this.date = date;

        }


        public class PriceException extends Exception {

            public PriceException(String massage) {

                super(massage);

            }


        }

        public class DateException extends Exception {

            public DateException(String massage) {

                super(massage);

            }


        }

    }

