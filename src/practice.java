import java.util.*;
import java.lang.*;

class practice {
    public static void main(String[] args) {
//        Scanner s = new Scanner(System.in);
//        int n = s.nextInt();
//        int star = n;
//        int space = -1;
//        int val=2;
//
//        for (int i = 0; i < n; i++) {
//            for (int j = 0; j < star; j++) {
//                System.out.print("*\t");
//                if (i != 0 || i != n - 1) {
//                       if (j == val) {
//                           int any=0;
//                        while (any < space) {
//                            System.out.print("\t");
//
//                            j++;
//                            any++;
//                        }
//                    }
//                }
//
//            }
//            System.out.println();
//            if (i < n / 2) {
//                space += 2;
//
//                val --;
//            } else {
//
//                space -= 2;
//                val ++;
//
//            }
//
//        }
//    }
//
//}

    Scanner s=new Scanner(System.in);
    String str=s.nextLine();

      System.out.println("\n" + Subseq("",str));


              }
public static int Subseq(String processed,String unprocessed){
        int count=0;
        if(unprocessed.isEmpty()){

        System.out.print(processed+" ");


        return 1;
        }

        char ch=unprocessed.charAt(0);
        unprocessed=unprocessed.substring(1);

        count+=Subseq(processed,unprocessed);
        count+=Subseq(processed+ch,unprocessed);
        return count;
        }
        }
