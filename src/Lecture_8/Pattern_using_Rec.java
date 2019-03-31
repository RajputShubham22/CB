package Lecture_8;

public class Pattern_using_Rec {
    public static void main(String[] args) {
        pattern(5,5);}

    public static void pattern(int row,int col){
 if (row==0){
     pattern(row-1,0);
     return ;
 }
 if(row==col){
     System.out.println();
    pattern(row-1,col);
    return;
 }
        System.out.print("* ");
    pattern(row,col-1);
    }




}
