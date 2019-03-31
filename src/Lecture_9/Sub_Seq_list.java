package Lecture_9;

import java.util.ArrayList;

public class Sub_Seq_list {
    public static void main(String[] args) {
        ArrayList<String> list=new ArrayList<>();
     Subseq_list("","abc",list);
        System.out.println(list);
    }
    public static void Subseq_list(String processed,String unprocessed,ArrayList<String> list){
        if(unprocessed.isEmpty()) {
            if (!processed.isEmpty()) {
                list.add(processed);

            }
            return;
        }
        char ch=unprocessed.charAt(0);
        unprocessed=unprocessed.substring(1);
        Subseq_list(processed+ch,unprocessed,list);
        Subseq_list(processed,unprocessed,list);

    }
}



