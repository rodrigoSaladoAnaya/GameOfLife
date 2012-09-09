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
        int cellPosition = 0;
        for (int i = 0; i != LENGTH; i++) {
            for (int j = 0; j != LENGTH; j++) {
                BOARD[i][j] = cellsHealth[cellPosition++];
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
        for (int i = 0; i < LENGTH; i++) {
            for (int j = 0; j < LENGTH; j++) {
                if (i == 1 && j == 1) { continue; }
                count = BOARD[i][j] ? ++count : count;
            }
        }
        return count;
    }
}
