package week7.lesson14;


public class Task4 {

    public static void main(String[] args) {

        Tree tree = new Tree(new Node(null,null,5));

        find(tree,6);

    }



    public static void find(Tree tree, int findValue){

        while (true){



        }



    }


    static class Node{

        Node left;
        Node right;
        int value;

        public Node(Node left,Node right,int value){

            this.left = left;
            this.right = right;
            this.value = value;

        }

    }

    static class Tree{

        Node top;

        public Tree(Node top){

            this.top = top;

        }
    }



}
