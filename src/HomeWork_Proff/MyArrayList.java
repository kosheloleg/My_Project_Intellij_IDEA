package HomeWork_Proff;




public class  MyArrayList<Q> {

    Q vector[];

    int free;

    MyArrayList(){

        vector = (Q[])(new Object[10]);
        free = 10;
    }

    MyArrayList(int size){

        if (size==0);


        this.vector = (Q[])(new Object[size]);

        free = size;

    }

    public int getFree(){

        return free;

    }

    public int size(){

        return vector.length-free;

    }

    public void add(Q k){

        if (free>=1){

            vector[vector.length-free] = k;

            free=free-1;

        } else {

            Q[] vectorExt = (Q[])(new Object[vector.length*3/2]);
            int i;

            for (i=0;i<vector.length;i++){

                vectorExt[i] = vector[i];

            }

            vectorExt[i]=k;

            free = vectorExt.length - vector.length-1;

            vector = vectorExt;

        }



    }

    public Q get(int k){

        return vector[k-1];

    }

    public void remove(int k){

        Q vectorExt[];

        vectorExt = (Q[])(new Object[vector.length]);


        for (int i=0;i<vector.length;i++){

            if (i==k-1){continue;}

            else if (i>k-1) {

                vectorExt[i-1] = vector[i];

            }


            else vectorExt[i] = vector[i];

        }

        vector = vectorExt;

        free++;
    }


}
