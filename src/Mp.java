import java.util.Scanner;
public class Mp {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        int star=1;
        int space=n-1;
        int space2=-1;


        for (int i = 0; i <n ; i++) {
            int val2=i+1;

            for (int j = 0; j <space ; j++) {

                System.out.print("  ");
            }
            for (int k = 0; k <star ; k++) {


                System.out.print((star-k)+" ");
            }
            if(i!=0 && i!=n-1) {
                for (int j = 0; j < space2; j++) {
                    System.out.print("  ");
                }
                for (int k = 0; k < star; k++) {
                    int val=k+1;

                    System.out.print(val+" ");
                    val--;
                }
            }
            System.out.println();
            if(i<n/2){
                space-=2;
                star++;
                space2+=2;
            }
            else
            {
                space+=2;
                star--;
                space2-=2;
            }

        }
    }
}


