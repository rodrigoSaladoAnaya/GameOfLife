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

//    public void nextEvolution() {
//        boolean cellHealth = getCellHealth();
//        int neighboursCount = getNeighboursCount();
//        boolean health = getHealthApplyingRules(neighboursCount, cellHealth);
//        setCellHealt(health);
//    }

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

        BOARD[0][0] = cellsHealth[0];
        BOARD[0][1] = cellsHealth[1];
        BOARD[0][2] = cellsHealth[2];

        BOARD[1][0] = cellsHealth[3];
        BOARD[1][1] = cellsHealth[4];
        BOARD[1][2] = cellsHealth[5];

        BOARD[2][0] = cellsHealth[6];
        BOARD[2][1] = cellsHealth[7];
        BOARD[2][2] = cellsHealth[8];
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
