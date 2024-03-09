package GraphsLearning;

import java.util.ArrayList;

public class graphslearning {

    static  void addEdge(ArrayList<ArrayList<Integer>> arr, int u , int v ){
        arr.get(u).add(v) ;
        arr.get(v).add(u) ;
    }


    public static void main(String[] args) {
        int v = 5 ;
        ArrayList<ArrayList<Integer>> array  = new ArrayList<ArrayList<Integer>>();

        for(int i = 0 ; i <v ; i ++){
            array.add(new ArrayList<Integer>());
        }

        addEdge(array, 0, 1);
        addEdge(array, 0, 2);
        addEdge(array, 1, 2);
        addEdge(array, 1, 3);

        System.out.println(array.get(0));


    }
}
