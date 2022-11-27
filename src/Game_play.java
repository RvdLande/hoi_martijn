public class Game_play {

    public static int rows = 20;
    public static int cols = 20;
    public static int time_delay = 500;


    public static void initializeGrid(Game_bord grid) {

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                int randVal = (int) (Math.random() * 3);
                if (randVal == 0) {
                    grid.set(i, j, 1);
                }
            }
        }
    }



    public static void displayGrid(Game_bord grid) {

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                if (grid.get(i, j) == 0) {
                    System.out.print("0");
                } else if (grid.get(i, j) == 1) {
                    System.out.print("1");
                }
            }
            System.out.println();
        }
    }

    public static void NextGen(Game_bord grid, Game_bord Newgrid){
        for (int i = 0; i < rows; i++){
            for (int j = 0; j < cols; j++){
                int burencount = Buren(i,j,grid);
                if (grid.get(i,j) == 1 && burencount < 2){
                    Newgrid.set(i,j,0);
                }
                else if (grid.get(i,j) == 1 && burencount < 4){
                    Newgrid.set(i,j,1);

                }
                else if (grid.get(i,j) == 1 && burencount > 3){
                    Newgrid.set(i,j, 0);
                }
                else if (grid.get(i,j) == 0 && burencount == 3){
                    Newgrid.set(i,j,1);
                }
                else{
                    Newgrid.set(i,j,0);
                }
            }
        }
    }


    public static int Buren(int row, int col, Game_bord grid){
        int count = 0;
        for (int i = row - 1; i <= row + 1; i++)
        {
            for (int j = col - 1; j <= col + 1; j++)
            {
                if (i >= 0 && i < rows &&
                    j >= 0 && j < cols &&
                    !(i == row && j == col) &&
                    grid.get(i,j) == 1)
                {
                    count++;
                }
            }
        }
        return count;
    }


    public static void nextDisplay(Game_bord grid, Game_bord Newgrid){
        for (int i = 0; i < rows; i++){
            for (int j = 0; j < cols; j++){
                grid.set(i,j,Newgrid.get(i,j));
            }
        }
    }

    private static void clear(){
        System.out.print("\033[H\033[2J");
        System.out.flush();
        System.out.println("\n");
    }

    private static void delay(int time_delay){
        try {
            Thread.sleep(time_delay);
        }
        catch (InterruptedException ex){
            Thread.currentThread().interrupt();
        }
    }

    public static void main(String[] args){

        Game_bord grid =  new Game_bord(rows, cols);
        Game_bord Newgrid = new Game_bord(rows,cols);
        initializeGrid(grid);
        for (int i = 0; i < 100; i++){
            clear();
            displayGrid(grid);
            delay(time_delay);
            NextGen(grid, Newgrid);
            nextDisplay(grid, Newgrid);

        }
        }



}
