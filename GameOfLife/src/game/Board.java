package game;

/**
 * @author rodrigo salado anaya
 */
public class Board {

    private static int LENGTH;
    private static boolean[][] BOARD;

    private boolean[] setNeighboursValues(
            int sec0, int sec1, int sec2,
            int pos0, int pos1, int pos2) {

        int boardSize = 9;
        boolean[] neighbours = new boolean[boardSize];
        neighbours[0] = BOARD[sec0][pos0];
        neighbours[1] = BOARD[sec0][pos1];
        neighbours[2] = BOARD[sec0][pos2];

        neighbours[3] = BOARD[sec1][pos0];
        neighbours[4] = BOARD[sec1][pos1];
        neighbours[5] = BOARD[sec1][pos2];

        neighbours[6] = BOARD[sec2][pos0];
        neighbours[7] = BOARD[sec2][pos1];
        neighbours[8] = BOARD[sec2][pos2];
        return neighbours;
    }

    protected boolean[] getNeighboursByCell(int x, int y) {   
        return setNeighboursValues(before(x), x, after(x), before(y), y, after(y));
    }
    private int before( int n ) { 
        int length = LENGTH -1;
        return n == 0 ? length : n - 1;
    }
    private int after( int n ) { 
        int length = LENGTH -1;
        return n == length ? 0 : n + 1;
    }
    

    public void nextStep() {
        boolean[][] nextBoard = new boolean[LENGTH][LENGTH];
        for (int i = 0; i != LENGTH; i++) {
            for (int j = 0; j != LENGTH; j++) {
                Cell cell = new Cell();
                boolean[] neighbours = this.getNeighboursByCell(i, j);
                nextBoard[i][j] = cell.getCellHealth(neighbours);
            }
        }
        BOARD = nextBoard;
    }

    public void setBoardLength(int length) {
        LENGTH = length;
        BOARD = new boolean[LENGTH][LENGTH];
    }

    public void fillBoard(boolean[][] board) {
        BOARD = board;
    }

    public boolean[][] getActualBoard() {
        return BOARD;
    }
}
