package Lecture_6;

import java.util.Scanner;

public class Insertion_sort {
    public static void main(String[] args) {


        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int nums1[] = get(n, s);
        display(nums1);
        insertion(nums1);
        System.out.println("Sorted Array :");
        display(nums1);
    }

    public static int[] get(int n, Scanner s) {

        int num[] = new int[n];
        for (int i = 0; i < num.length; i++) {
            num[i] = s.nextInt();
        }
        return num;
    }

    public static void display(int num[]) {
        for (int i = 0; i < num.length; i++) {
            System.out.println(num[i] + " ");
        }
        System.out.println("\n");
    }

    public static void insertion(int num[]) {
        int temp;
        for (int i = 0; i < num.length; i++) {
            for (int j = i; j >= 1; j--) {
                if (num[j] <= num[j + 1]) {
                    temp = num[j + 1];
                    num[j] = num[j + 1];
                    num[j + 1] = temp;
                } else {
                    break;
                }    }     }

    }


}