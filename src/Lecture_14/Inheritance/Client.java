package Lecture_14.Inheritance;

public class Client {
    public static void main(String[] args) {

        Car mycar = new Car();
        System.out.println(mycar.door);

        Maruti mymaruti = new Maruti();
        System.out.println(mymaruti.door);
        mycar.run();
        mymaruti.run();
int m=max(223,34,54,64,745);
        System.out.println(m);
    }
    public static int max(int... arr){ ////int... considers to create an array of variable/undefined size
        int max=arr[0];
        for (int i = 0; i <arr.length ; i++) {
            if(arr[i]>max){
                max=arr[i];
            }
        }
        return max;
        }

}

