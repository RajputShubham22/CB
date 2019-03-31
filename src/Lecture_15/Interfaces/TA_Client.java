package Lecture_15.Interfaces;

public class TA_Client {
    public static void main(String[] args) {
        Teacher ta=new CBTA() ;
        ta.study();
        ta.teach();
    }
}
