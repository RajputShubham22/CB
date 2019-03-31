package Lecture_8;

import java.util.Arrays;

public class Bubble_Sort_Using_Rec {
    public static void main(String[] args) {
        int[] nums = {4, 2, 3, 4, 5, 6, 5, 5, 2, 4, 5, 3, 4};
        Bubble(nums.length - 1, 0, nums);
        System.out.println(Arrays.toString(nums));
    }

    public static void Bubble(int row, int col, int[] nums) {
        if (row == 0) {
            return;
        }
        if (row == col) {

            Bubble(row - 1, 0, nums);
            return;
        }
        if (nums[col] > nums[col + 1]) {
            int temp = nums[col];
            nums[col] = nums[col + 1];
            nums[col + 1] = temp;
        }
        Bubble(row, col + 1, nums);

    }
}
