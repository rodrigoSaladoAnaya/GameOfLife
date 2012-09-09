/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package game;

/**
 *
 * @author rsa
 */
public class World {

    private static int LENGTH = 3;
    private static boolean LIVE = true;
    private static boolean DEAD = false;
    private boolean[][] BOARD;

    public boolean getHealthApplyingRules(int neighboursCount, boolean cellHealth) {
        if (cellHealth == LIVE && neighboursCount < 2) {
            return DEAD;
        } else if (cellHealth == LIVE && neighboursCount > 3) {
            return DEAD;
        } else if (cellHealth == DEAD && neighboursCount != 3) {
            return DEAD;
        }
        return LIVE;
    }

    public void fillBoard(boolean[] cellsHealth) {
        BOARD = new boolean[LENGTH][LENGTH];
        int length = 3;
        int p = 0;
        for (int i = 0; i != length; i++) {
            for (int j = 0; j != length; j++) {
                BOARD[i][j] = cellsHealth[p++];
            }
        }
    }

    public boolean getCellHealth() {
        return BOARD[1][1];
    }

    public void setCellHealt(boolean cellHealth) {
        BOARD[1][1] = cellHealth;
    }

    public int getNeighboursCount() {
        int count = 0;
        
        count = BOARD[0][0] ? ++count : count;
        count = BOARD[0][1] ? ++count : count;
        count = BOARD[0][2] ? ++count : count;

        count = BOARD[1][0] ? ++count : count;
        count = BOARD[1][2] ? ++count : count;

        count = BOARD[2][0] ? ++count : count;
        count = BOARD[2][1] ? ++count : count;
        count = BOARD[2][2] ? ++count : count;
        return count;
    }
}
