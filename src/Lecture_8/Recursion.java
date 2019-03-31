package Lecture_8;

public class Recursion {
    public static void main(String[] args) {
        int res=power1(5,5);
        System.out.println(res);
    }
    public static int power1(int x, int n){
    if(n==0){
            return 1;
        }

        int res=x*power1(x,n-1);
           return res;



    }
}

