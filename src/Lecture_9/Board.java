package Lecture_9;

public class Board {
    public static void main(String[] args) {
        board("",4,3);
    }
public static void board(String processed,int target,int face){

        if(target==0){
            System.out.println(processed);
            return;
        }
     for (int i = 1; i <= face && i <= target ; i++) {
        board(processed + i, target - i, face);
    }

}

}

