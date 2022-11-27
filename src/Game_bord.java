public class Game_bord {


    public static int rows = 20;
    public static int cols = 20;
    public static int time_delay=500;

    int[][] grid;

    public Game_bord(int rows, int cols){
        grid = new int[rows][cols];

    }
    public int get(int rows, int cols){

        return grid[rows][cols];

    }

    public void set(int rows, int cols, int value){

        grid[rows][cols] = value;

    }
    public int GetRows(){

        return grid.length;

    }
    public int GetCols(){

        return grid[0].length;

    }
    public String toString(){

        String result = "";
        for (int i = 0; i < GetRows(); i++){
            for (int j = 0; j < GetCols(); j++){
                result += grid[i][j];

            }
            result += "\n";
        }

        return result;

    }

}
