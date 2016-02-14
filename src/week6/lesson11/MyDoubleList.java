package week6.lesson11;

public class MyDoubleList {

    DoubleElement first;

    public static void main(String[] args) {

        MyDoubleList list = new MyDoubleList();
        DoubleElement e4 = new DoubleElement(20);
        DoubleElement e5 = new DoubleElement(30);
        DoubleElement e3 = new DoubleElement(40);
        DoubleElement e2 = new DoubleElement(50);
        DoubleElement e1 = new DoubleElement(60);
        list.add(e4); list.print();
        list.add(e5); list.print();
        list.add(e3); list.print();
        list.add(e2); list.print();
        list.add(e1); list.print();

        System.out.println("Size list = " +list.size());

        System.out.println("get = " +list.get(4).getValue());

    }

    public DoubleElement get(int i){

        if (first==null) return null;
        else if (i==0) return first;

        DoubleElement last = first;

        int k=0;
        while (last.getNext()!=null){

            last = last.getNext();
            k++;

            if (i==k) return last;
        }

        return null;

    }


    public void add(DoubleElement e){

        if (first == null) {
            first = e;
        } else {
            DoubleElement last = first;
            while (last.getNext() != null) {
                last = last.getNext();
            }
            last.setNext(e);
        }

    }

    public int size(){

        if (first==null) return 0;

        DoubleElement last = first;
        int i=1;

        while (last.getNext()!=null){

            last = last.getNext();

            i++;
        }

        return i;

    }

    public void print() {
        if (first == null)
            System.out.println("list is empty!");
        DoubleElement act = first;
        System.out.print("List:");
        int i = 0;
        while (act != null) {
            if ( 0 < i)
                System.out.print(",");
            System.out.print(" [" + i+++ "]=" + act.getValue());
            act = act.getNext();
        }
        System.out.println();
    }





}

class DoubleElement {
    private int value;
    private DoubleElement next;
    private DoubleElement preev;

    DoubleElement(int value){

       this.value = value;
    }

    public DoubleElement getPreev(){

        return preev;
    }

    public int getValue() {
        return value;
    }

    public void setPreev(DoubleElement e){

        this.preev = e;

    }

    public DoubleElement getNext() {
        return next;
    }

    public void setNext(DoubleElement next) {

        next.setPreev(this);
        this.next = next;



    }


}
