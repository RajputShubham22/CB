package Lecture_6;

public class String_builder_example {
    public static void main(String[] args) {
        StringBuilder builder=new StringBuilder();
        //System.out.println(builder.insert(1,"oo"));
        //System.out.println(builder.replace(1, "oo"));
        //System.out.println(builder.replace(1,3,"00"));
        //System.out.println(builder.delete(1,2));
        int[] nums={6,4,45,45,64};
        builder.append("[");

        for (int i = 0; i <nums.length ; i++) {
            builder.append(nums[i]);
          if(i<nums.length-1){
            builder.append(",");
        }}
        builder.append("]");
        System.out.println(builder);
    }
}
