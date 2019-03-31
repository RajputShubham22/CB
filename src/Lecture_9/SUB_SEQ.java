package Lecture_9;

public class SUB_SEQ {
    public static void main(String[] args) {
        System.out.println(count_func("",4,3));
    }
    public static int count_func(String processed , int target , int face){
        int count=0;
        if(target==0){
            System.out.println(processed);
            return 1;
        }
        for (int i = 1; i <= face && i <= target ; i++) {
            count=count+count_func(processed + i, target - i, face);
        }
        return count;
    }
}
