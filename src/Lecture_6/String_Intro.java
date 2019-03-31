package Lecture_6;

import java.util.Arrays;

public class String_Intro {
    public static void main(String[] args) {

        String greet = "Welcome";
        String greet2 =new String("Welcome");
        String student = " to CB";
        String another="naman";
        String total = greet + student;
        char[] ch = greet.toCharArray();
       // subString(greet);
        boolean ans=pallindrome(another);
        System.out.println(ans);

        System.out.println(greet.equals(greet2));
//        System.out.println(greet);
//        print(greet);
//        System.out.println(total);
//        System.out.println(greet.substring(3));}
        //        for (int i = 0; i <greet.length() ; i++) {
//            System.out.println(greet.charAt(i));}
//            ch[0]='v';
//            System.out.println(Arrays.toString(ch));
//        }
    }

//    public static void print(String line) {
//
//        for (int i = 0; i < line.length(); i++) {
//            System.out.println(line.charAt(i));
//        }
//    }

//    public static void subString(String line) {
//        for (int i = 0; i < line.length(); i++) {
//            for (int j = 0; j <= line.length(); j++) {
//                if (i <= j) {
//                    System.out.println(line.substring(i, j));
//                }
//            }
//        }
//    }
    public static boolean pallindrome(String line){
      int left=0;
      int right=line.length()-1;
      while(left<right){
          if(line.charAt(right) != line.charAt(left)) {
              return false;

          }
              left++;
              right--;

      }
    return true;
    }
}