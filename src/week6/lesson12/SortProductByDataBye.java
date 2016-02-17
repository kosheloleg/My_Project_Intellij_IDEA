package week6.lesson12;


import java.util.Comparator;

public class SortProductByDataBye implements Comparator<Product>{

    @Override
    public int compare(Product pr1,Product pr2){

        return (int)(pr1.getDate().compareTo(pr2.getDate()) );

    }


}
