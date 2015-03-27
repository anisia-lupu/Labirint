import java.awt.*;
import java.io.Serializable;

/**
 * Created by Anisia-Ioana on 3/24/2015.
 */
public class LabirintView1 implements LabyrinthView, Serializable {
    private Integer[][] maze;

    public Integer[][] getMaze(){
        return this.maze;
    }

    public void setMaze(Integer[][] maze) {
        this.maze = maze;
    }

    @Override
    public String toString(){
        String result = "\n";

        for (int row = 0; row < maze.length; row++) {
            for (int column = 0; column < maze[0].length; column++) {
                result += "|";
                if (maze[row][column] == -1)
                    result += "S";
                else if (maze[row][column] == 0)
                    result += " ";
                else if (maze[row][column] == 2)
                    result += "F";
                else
                    result += "*";
                // result += labirint[row][column] + " ";

            }
            result += "|";
            result += "\n";
        }
        return result;
    }


}
