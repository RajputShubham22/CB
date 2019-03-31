package Lecture_10;

import java.util.Arrays;

public class String_Permuatation {
    public static void main(String[] args) {

        int[] f=freq("aaabbvv");
        System.out.println(Arrays.toString(f));
    }

    public static int[] freq(String line) {
       int[] freq=new int[26];
       int index=0;
        for (int i = 0; i <line.length() ; i++) {
            if (line.charAt(i) >= 'a' && line.charAt(i) <= 'z') {
                freq[line.charAt(i) - 'a']++;
            }
        }

        return freq;
        }
    }
