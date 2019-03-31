package Lecture_10;

public class lexo_Numbers {
    public static void main(String[] args) {

lexo(0,100);
}
public static void lexo(int val,int target){
        if(val>target){
            return;
        }
    for (int i = 0; i <10 ; i++) {
        if(val==0 && i==0){
            continue;
        }
        int v=val*10+i;
    if(v<=target){
        System.out.println(v);
        lexo(v,target);
    }
    }


}
}
