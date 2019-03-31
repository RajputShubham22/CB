package lecture_5;

import java.util.Scanner;

public class Array {

    public static void main(String[] args) {
        ///int[] num = new int[10];


        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int[] num1 = get(n, s);
        display(num1);
        swap(num1, 2, 3);
        display(num1);
        int m = max(num1);

        System.out.println(m);




        //        for (int i = 0; i <num.length ; i++) {
//            System.out.println();
//        }
//        System.out.println(num[7]);
//    }
    }




    public static int[] get(int n, Scanner s) {
        int[] nums = new int[n];
        for (int i = 0; i < nums.length; i++) {
            nums[i] = s.nextInt();
        }
        return nums;
    }

    public static void display(int[] n) {
        for (int i = 0; i < n.length; i++) {
            System.out.print(n[i] + " ");
        }
        System.out.print("\n");
    }

    public static void swap(int[] num, int f, int s) {
        int temp = num[f];
        num[f] = num[s];
        num[s] = temp;


    }

    public static int max(int[] num) {

        int max = 0;
        int i;
        for (i = 0; i < num.length; i++) {

            if (num[i] > num[max]) {
                max = i;
            }
        }

        return max;
    }


}





