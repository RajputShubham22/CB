package Lecture_6;
import java.util.ArrayList;
import java.util.Arrays;

public class Inverse_Array {
    public static void main(String[] args) {
    int[] num1={0,2,4,1,3,5};
    int[] res=inverse(num1);
        System.out.println(Arrays.toString(res));
    }
    public static int[] inverse(int[] nums){
        int[] res = new int[nums.length];
        for(int p=0;p<nums.length;p++){

            int v=nums[p];
            res[v]=p;


        }
        return res;

    }
}
