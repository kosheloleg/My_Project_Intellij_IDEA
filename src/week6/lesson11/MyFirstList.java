package week6.lesson11;

public class MyFirstList {
    Element first;

    public static void main(String[] args) {

        MyFirstList list = new MyFirstList();
        Element e4 = new Element(10);
        Element e5 = new Element(20);
        Element e3 = new Element(30);
        Element e2 = new Element(40);
        Element e1 = new Element(50);
        list.add(e4); list.print();
        list.add(e5); list.print();
        list.add(e3); list.print();
        list.add(e2); list.print();
        list.add(e1); list.print();

        System.out.println("Size list = " +list.size());

        System.out.println("get = " +list.get(4).getValue());


    }

    public void add(Element e) {
        if (first == null) {
            first = e;
        } else {
            Element last = first;
            while (last.getNext() != null) {
                last = last.getNext();
            }
            last.setNext(e);
        }
    }

    public void print() {
        if (first == null)
            System.out.println("list is empty!");
        Element act = first;
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

    public int size(){

        if (first==null) return 0;

        Element last = first;
        int i=1;

        while (last.getNext()!=null){

            last = last.getNext();

            i++;
        }

        return i;

    }

    public Element get(int i){

        if (first==null) return null;
        else if (i==0) return first;

        Element last = first;

        int k=0;
        while (last.getNext()!=null){

            last = last.getNext();
            k++;

            if (i==k) return last;
        }

        return null;

    }
}

class Element {
    private int value;
    private Element next;

    public Element(int v) {
        value = v;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    public Element getNext() {
        return next;
    }

    public void setNext(Element next) {
        this.next = next;
    }



}

//get (i)
//size()
//print()
//Элемент (preev,next,value)
//Список (fisrt,last)