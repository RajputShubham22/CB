//package Lecture_10;
//
//import java.util.Arrays;
//
//public class sorted_string {
//    public static void main(String[] args) {
//        String line="abc";
//        int[] f=lexo("",,line.length());
//        System.out.println(Arrays.toString(f));
//    }
//
//    public static void lexo(String processed,int[] f,int length) {
//       if(length==0){
//           System.out.println(processed);
//       return;
//       }
//        for (int i = 0; i <f.length ; i++) {
//            if (f[i] > 0) {
//                f[i]--;
//                lexo(processed + (char) (i + 'a'), f, length - 1);
//                f[i]++;
//            }
//
//        }
//    }
//}
//
//
//
