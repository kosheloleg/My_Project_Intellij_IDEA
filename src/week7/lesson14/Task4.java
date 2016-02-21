package week7.lesson14;


import java.util.ArrayList;

public class Task4 {

    public static void main(String[] args) {

        Tree tree = new Tree(new Node(new Node(null,null,3),new Node(new Node(null,null,6),new Node(null,null,7),7),5));

        System.out.println("Рекурсия "+find(tree.top,2));
        System.out.println("Без рекурсии "+findNoRecursia(tree.top,2));

    }


    public static boolean find(Node top, int findValue) {

            if (top == null)
                return false;
            if (top.value == findValue)
                return true;
            return find(
                    findValue < top.value ? top.left
                            : top.right, findValue);


    }

    public static boolean findNoRecursia(Node top, int findValue){

        ArrayList<Node> nodes = new ArrayList<Node>();

        nodes.add(top);

        Node n;

        for (int i=0;i<nodes.size();i++){

            n = nodes.get(i);

            if (n==null) return false;

            if (n.value==findValue) return true;

            if (findValue>=n.value){

                nodes.add(n.right);

            } else nodes.add(n.left);
        }



        return false;

    }


    static class Node {

        Node left;
        Node right;
        int value;

        public Node(Node left, Node right, int value) {

            this.left = left;
            this.right = right;
            this.value = value;

        }

    }

    static class Tree {

        Node top;

        public Tree(Node top) {

            this.top = top;

        }
    }


}
