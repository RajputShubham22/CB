package Lecture_10;

public class Two_D_Arrays {
    public static void main(String[] args) {
        int[][] nums=new int[5][5];
        for (int i = 0; i <nums.length ; i++) {
            {
                for (int j = 0; j <nums[i].length; j++) {
                    System.out.print(nums[i][j]);
                }
                System.out.println();
            }
        }
    }
}
