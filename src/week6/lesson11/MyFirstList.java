package week6.lesson11;

public class MyFirstList {
    Element first;

    public static void main(String[] args) {

        MyFirstList list = new MyFirstList();
        Element e4 = new Element(10);
        Element e5 = new Element(20);
        Element e3 = new Element(30);
        list.add(e4); list.print();
        list.add(e5); list.print();
        list.add(e3); list.print();
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