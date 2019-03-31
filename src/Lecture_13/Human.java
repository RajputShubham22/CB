package Lecture_13;

public class Human {
    public String name;
    public int age;
    public int balance ;
    public static int population=0;
    public Human(String name,int age,int balance) {
        this.name = name;
        this.age = age;
        this.balance = balance;
        }
public Human(){
        population++;
    }

    public void udhaar(){
        if(balance>=100){
            balance-=100;

        }
        else{
            System.out.println("no money");
        }
    }

}

