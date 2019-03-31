
public class Bitwise_Examples {
    public static void main(String[] args) {


//    int arr=odd0cc(nums);
//        System.out.println(setbits(0b101010));
        System.out.println(toggle(0b1010));

    }
//
//    public  static int odd0cc(int[] nums){
//        int acc=0;
//        int same=nums[0];
//         for(int i=0;i<nums.length;i++) {
//        acc=acc^nums[i];
//         }
//         return acc;
//
//         }

//public static int setbits(int num) {
//    int count = 0;
//    while (num != 0) {
//
//        if ((num & 1)==0) {
//            count++;
//        }
//        num = num >> 1;
//
//    }
//
//    return count;
//}
public static int toggle(int num){
int t=0;
int index=0;
while(num!=0){
int rem=(num&1)^1 ;//toggle_data occurs
    t=t+(rem<<index);
    num=num>>1;
    }
return t;
}

    }

