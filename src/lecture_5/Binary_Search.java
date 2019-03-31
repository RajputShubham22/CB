package lecture_5;

import java.util.Scanner;

public class Binary_Search {
    public static void main(String[] args) {


        Scanner s=new Scanner(System.in);
        int n = s.nextInt();
        int[] num1 = get(n, s);
        binary(num1,22);

            }


    public static int[] get(int n, Scanner s) {
        int[] nums = new int[n];
        for (int i = 0; i < nums.length; i++) {
            nums[i] = s.nextInt();
        }
        return nums;
    }

     public static void binary(int num[],int target) {

         int start = 0;
         int end = num.length - 1;
         int mid = start + end;
         while (start <= end) {
             for (int i = 0; i < num.length; i++) {

                 if (num[mid] == target) {
                     System.out.println(mid);
                 } else if (num[mid] > target) {
                     start = mid + 1;
                 } else if (num[mid] < target) {
                     end = mid - 1;
                 }


             }
         }


     }}