package Lecture_10;

public class Major_diagonal {
    public static void main(String[] args) {
        System.out.println(Major_diag(3,3));
    }
public static int Major_diag(int row,int col){
        if(row==1 && col==1){
            return 1;
        }
        int step=0;
        if(row==col && row!=0){
            step+=Major_diag(row-1,col);
        }
        if(row==col && col!=0){
            step+=Major_diag(row,col-1);
        }
        return step;
}

}

