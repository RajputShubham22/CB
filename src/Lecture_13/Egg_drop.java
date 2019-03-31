package Lecture_13;

public class Egg_drop {
    public static void main(String[] args) {
        int val=eggdrop(2,30);
        System.out.println(val);
    }
    public static int eggdrop(int eggs,int floors){
   int min=floors;
     if(eggs==1){
         return floors;
     }
     if(floors==0){
         return 0;
     }
        for (int i = 1; i <=floors ; i++) {
            int down=eggdrop(eggs-1,i-1);
            int up= eggdrop(eggs,floors-i);

        int max=1+Math.max(up,down);
        if(max<min) {
            min = max;
        }
        }
        return min;


    }
}
