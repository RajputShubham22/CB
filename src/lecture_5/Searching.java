package lecture_5;
import java.util.Scanner;

public class Searching {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter size of the array : ");
        int size=s.nextInt();
        int arr[]=get(size,s);
        System.out.println("Enter the Number you want to find : ");
        int num=s.nextInt();
        int index=linear(arr,num);
        System.out.println("Found at Index : "+index);
    }

    public static int[] get(int size,Scanner s){
        int[] nums=new int[size];
        for (int i = 0; i <size; i++) {
            nums[i]=s.nextInt();
        }
        return nums;

    }

    public static int linear(int[] nums,int target)

    {
        for (int i = 0; i < nums.length; i++) {
            if(nums[i]==target){
                return i;
            }
        }
        return -1;

    }
}
