package ArraysLearning;

import java.util.ArrayList ;
public class ArrayListLearning {
    public static void main(String[] args) {
        ArrayList<Integer> arl = new ArrayList<Integer>();
        arl.add(1);
        arl.add(2);

        System.out.println(arl.isEmpty());
        System.out.println(arl.size());
        System.out.println(arl.get(arl.size()-1));

    }
}
