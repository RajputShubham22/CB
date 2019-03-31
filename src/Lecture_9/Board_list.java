package Lecture_9;

import lecture_5.Array;

import java.util.ArrayList;

public class Board_list {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        board_list("", 4, 3, list);
        System.out.println(list);
    }

    public static void board_list(String processed, int target, int face, ArrayList<String> list) {

        if (target == 0) {
            list.add(processed);
            return;
        }
        for (int i = 1; i <= face && i <= target; i++) {
            board_list(processed + i, target - i, face, list);
        }

    }
}