package Lecture_9;

public class SubSequence_Rec {
    public static void main(String[] args) {
        String str = "ab";
        Subseq(" ", str);
    }

    public static void Subseq(String processed, String unprocessed) {
        if (unprocessed.isEmpty()) {
            System.out.println(processed);
            return;
        }
        char ch = unprocessed.charAt(0);
        unprocessed = unprocessed.substring(1);
        Subseq(processed + ch, unprocessed);
        Subseq(processed, unprocessed);
    }
}

//public static void ASCII_Subseq(String processed,String unprocessed){
//    if(unprocessed.isEmpty()){
//        System.out.println(processed);
//        return;
//    }
//    char ch=unprocessed.charAt(0);
//    unprocessed=unprocessed.substring(1);
//    ASCII_Subseq(processed+ch,unprocessed);
//    ASCII_Subseq(processed+(int)(ch),unprocessed);
//    ASCII_Subseq(processed,unprocessed);
//}
//}
//
