/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package game;

/**
 *
 * @author rsa
 */
public class Play {

    private static int LENGTH = 3;
    private static boolean[][] BOARD = new boolean[LENGTH][LENGTH];
    private static char CELL_LIVE_CHAR = '*';
    private static char CELL_DEAD_CHAR = '-';

    public boolean[] getNeighboursByCell(int x, int y) {
        boolean[] neighbours = new boolean[9];
        int length = LENGTH - 1;
        if (x == 0 && y == 0) {
            neighbours[0] = BOARD[length][length];
            neighbours[1] = BOARD[length][0];
            neighbours[2] = BOARD[length][1];

            neighbours[3] = BOARD[0][length];
            neighbours[4] = BOARD[0][0];
            neighbours[5] = BOARD[0][1];

            neighbours[6] = BOARD[1][length];
            neighbours[7] = BOARD[1][0];
            neighbours[8] = BOARD[1][1];
            return neighbours;
        }

        if (x == 0 && y == length) {
            neighbours[0] = BOARD[length][length - 1];
            neighbours[1] = BOARD[length][length];
            neighbours[2] = BOARD[length][0];

            neighbours[3] = BOARD[0][length - 1];
            neighbours[4] = BOARD[0][length];
            neighbours[5] = BOARD[0][0];

            neighbours[6] = BOARD[1][length - 1];
            neighbours[7] = BOARD[1][length];
            neighbours[8] = BOARD[1][0];
            return neighbours;
        }

        if (x == length && y == 0) {
            neighbours[0] = BOARD[length - 1][length];
            neighbours[1] = BOARD[length - 1][0];
            neighbours[2] = BOARD[length - 1][1];

            neighbours[3] = BOARD[length][length];
            neighbours[4] = BOARD[length][0];
            neighbours[5] = BOARD[length][1];

            neighbours[6] = BOARD[0][length];
            neighbours[7] = BOARD[0][0];
            neighbours[8] = BOARD[0][1];
            return neighbours;
        }

        if (x == length && y == length) {
            neighbours[0] = BOARD[length - 1][length - 1];
            neighbours[1] = BOARD[length - 1][length];
            neighbours[2] = BOARD[length - 1][0];

            neighbours[3] = BOARD[length][length - 1];
            neighbours[4] = BOARD[length][length];
            neighbours[5] = BOARD[length][0];

            neighbours[6] = BOARD[0][length - 1];
            neighbours[7] = BOARD[0][length];
            neighbours[8] = BOARD[0][0];
            return neighbours;
        }

        if (x > 0 && x < length && y == 0) {
            neighbours[0] = BOARD[x - 1][length];
            neighbours[1] = BOARD[x - 1][0];
            neighbours[2] = BOARD[x - 1][1];

            neighbours[3] = BOARD[x][length];
            neighbours[4] = BOARD[x][0];
            neighbours[5] = BOARD[x][1];

            neighbours[6] = BOARD[x + 1][length];
            neighbours[7] = BOARD[x + 1][0];
            neighbours[8] = BOARD[x + 1][1];
        }

        if (x > 0 && x < length && y == length) {
            neighbours[0] = BOARD[x - 1][length - 1];
            neighbours[1] = BOARD[x - 1][length];
            neighbours[2] = BOARD[x - 1][0];

            neighbours[3] = BOARD[x][length - 1];
            neighbours[4] = BOARD[x][length];
            neighbours[5] = BOARD[x][0];

            neighbours[6] = BOARD[x + 1][length -1];
            neighbours[7] = BOARD[x + 1][length];
            neighbours[8] = BOARD[x + 1][0];
        }
        //bottom
//        if(){
//        
//        }
        return neighbours;
    }

    public void fillBoard(boolean[][] board) {
        BOARD = board;
    }

    private void printBoard() {
        for (int i = 0; i != LENGTH; i++) {
            for (int j = 0; j != LENGTH; j++) {
                char cellHealt = BOARD[i][j] ? CELL_LIVE_CHAR : CELL_DEAD_CHAR;
                System.out.print(cellHealt);
            }
            System.out.println();
        }
        System.out.println("next step ...");
    }
}
