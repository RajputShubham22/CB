package Lecture_10;

public class Maze_by_Array {
    public static void main(String[] args) {
        int row=4;
        int col=4;
        boolean[][] maze=new boolean[row+1][col+1];
        MazeByArray("",0,0,4,4,maze);
    }
    public static void MazeByArray(String path,int c_row,int c_col,int row, int col,boolean[][] maze){
        if(c_row==row && c_col==col){
            System.out.println(path);
                    return;
        }


if(c_col<0||c_row<0||c_col>col||c_row>row){
    return;
}

if(maze[c_row][c_col]){   //path has been already being done
        return;}


        maze[c_row][c_col]=true;

        MazeByArray(path+"U", c_row-1, c_col, row, col, maze);
        MazeByArray(path+"D", c_row+1, c_col, row, col, maze);
        MazeByArray(path+"R", c_row, c_col+1, row, col, maze);
        MazeByArray(path+"L", c_row, c_col-1, row, col, maze);

        maze[c_row][c_col]=false;
    }
}

