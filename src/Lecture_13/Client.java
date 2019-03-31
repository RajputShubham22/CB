package Lecture_13;

public class Client {
    public static void main(String[] args) {

        Human yash = new Human("yash",67,500);
        System.out.println(yash.name);
        System.out.println(yash.age);
        System.out.println(yash.balance);
        System.out.println(Human.population);
        Human abc = new Human("abc",67,500);
        System.out.println(Human.population);
    }
}
