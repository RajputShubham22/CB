package Lecture_15.Interfaces;


public class Client {
    public static void main(String[] args) {
        Teacher t=new Teacher_Implement();
        t.study();
        t.teach();
        Student s=new Student_Implement();
        s.study();
        s.play();
    }
}
