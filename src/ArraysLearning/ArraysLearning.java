package ArraysLearning;

import java.util.Arrays ;
public class ArraysLearning {

    public static void main(String[] args) {
        int[] nums = {1,2,2,2,3,4,5,5};
        System.out.println(Arrays.toString(removeDuplicates(nums)));

    }
    static int[] removeDuplicates(int[] arr){
        for (int i = 0; i < arr.length; i++) {
            if(i<arr.length-1)
            {
                if(arr[i] == arr[i+1]){
                    arr[i]=0;
                }
            }
        }
        return arr ;
    }
}
