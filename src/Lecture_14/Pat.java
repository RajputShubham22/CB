package Lecture_14;
import java.util.Scanner;
public class Pat {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int space = 0;
        int star=2*n+1;
        for (int i = 0; i < 2 * n + 1; i++) {
            for (int j = 0; j < space; j++) {
                if (i != 0 && i != 2 * n) {
                    System.out.print("  ");
                }
            }
            for (int k = 0; k <star; k++) {
                if(k<n) {
                    System.out.print((n-i-k)+" ");
                }
                else{
                    System.out.print("* ");
                }
                }

            System.out.println();

            if (i < n ) {
                space++;
                star-=2;
            } else {
                space--;
                star+=2;
            }
        }
    }
}

