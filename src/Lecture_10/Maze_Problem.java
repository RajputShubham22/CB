package Lecture_10;

public class Maze_Problem {
    public static void main(String[] args) {
        System.out.println(maze(3, 4));

    }

    public static int maze(int row, int col) {

        if (row == 1 && col == 1) {
            return 1;
        }
int step=0;
        if (row != 0) {
        step+=maze(row - 1, col);

        }
        if (col != 0) {
            step+=maze(row, col - 1);

        }
        return step;
    }
}
