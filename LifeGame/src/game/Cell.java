package game;

/**
 *
 * @author rodrigo salado anaya
 */
public class Cell {

    private final static int size = 3;
    private final static boolean LIVE = true;
    private final static boolean DEAD = false;
    private boolean[][] BOARD;

    public boolean applyRules(int neighbours, boolean cellHealth) {
        if (cellHealth == LIVE && neighbours < 2) {
            return DEAD;
        }
        if (cellHealth == LIVE && neighbours > 3) {
            return DEAD;
        }
        if (cellHealth == DEAD && neighbours != 3) {
            return DEAD;
        }
        return LIVE;
    }

    public void fillNeighbours(boolean[] cellsHealth) {
        BOARD = new boolean[size][size];
        int cellPosition = 0;
        for (int i = 0; i != size; i++) {
            for (int j = 0; j != size; j++) {
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
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                if (i == 1 && j == 1) {
                    continue;
                }
                count = BOARD[i][j] ? ++count : count;
            }
        }
        return count;
    }
}
