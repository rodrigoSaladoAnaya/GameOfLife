package game;

import org.junit.*;
import static org.junit.Assert.*;

/**
 * @author rodrigo salado anaya
 */
public class CellTest {

    private static final boolean LIVE = true;
    private static final boolean DEAD = false;

    public CellTest() {
    }

    @Test
    public void testRules() {
        Cell w = new Cell();
        //1st rule
        assertEquals(w.applyRules(0, LIVE), false);
        assertEquals(w.applyRules(1, LIVE), false);

        //2nd rule
        assertEquals(w.applyRules(2, LIVE), true);
        assertEquals(w.applyRules(3, LIVE), true);

        //3rd rule
        assertEquals(w.applyRules(4, LIVE), false);
        assertEquals(w.applyRules(5, LIVE), false);
        assertEquals(w.applyRules(6, LIVE), false);
        assertEquals(w.applyRules(7, LIVE), false);
        assertEquals(w.applyRules(8, LIVE), false);

        //4th rule
        assertEquals(w.applyRules(3, LIVE), true);

        //test False
        assertEquals(w.applyRules(0, DEAD), false);
        assertEquals(w.applyRules(1, DEAD), false);
        assertEquals(w.applyRules(2, DEAD), false);
        assertEquals(w.applyRules(4, DEAD), false);
        assertEquals(w.applyRules(5, DEAD), false);
        assertEquals(w.applyRules(6, DEAD), false);
        assertEquals(w.applyRules(7, DEAD), false);
        assertEquals(w.applyRules(8, DEAD), false);
    }

    @Test
    public void testGetCellHealt() {
        Cell w = new Cell();

        boolean[] cellsHealt = {
            DEAD, DEAD, DEAD,
            DEAD, LIVE, DEAD,
            DEAD, DEAD, DEAD,};
        w.fillNeighbours(cellsHealt);
        assertEquals(w.getCellHealth(), LIVE);

        cellsHealt = new boolean[]{
            DEAD, DEAD, DEAD,
            DEAD, DEAD, DEAD,
            DEAD, DEAD, DEAD,};
        w.fillNeighbours(cellsHealt);
        assertEquals(w.getCellHealth(), DEAD);
    }

    @Test
    public void testGetNeighboursCountgetNeighboursCount() {
        Cell w = new Cell();

        boolean[] cellsHealt = {
            DEAD, DEAD, DEAD,
            DEAD, LIVE, DEAD,
            DEAD, DEAD, DEAD,};
        w.fillNeighbours(cellsHealt);
        assertEquals(w.getNeighboursCount(), 0);


        cellsHealt = new boolean[]{
            LIVE, DEAD, DEAD,
            DEAD, LIVE, DEAD,
            DEAD, DEAD, DEAD,};

        w.fillNeighbours(cellsHealt);
        assertEquals(w.getNeighboursCount(), 1);

        cellsHealt = new boolean[]{
            LIVE, DEAD, DEAD,
            DEAD, LIVE, DEAD,
            DEAD, DEAD, LIVE,};

        w.fillNeighbours(cellsHealt);
        assertEquals(w.getNeighboursCount(), 2);

        cellsHealt = new boolean[]{
            LIVE, LIVE, DEAD,
            DEAD, DEAD, DEAD,
            DEAD, DEAD, LIVE,};

        w.fillNeighbours(cellsHealt);
        assertEquals(w.getNeighboursCount(), 3);

        cellsHealt = new boolean[]{
            LIVE, LIVE, DEAD,
            DEAD, DEAD, DEAD,
            DEAD, LIVE, LIVE,};

        w.fillNeighbours(cellsHealt);
        assertEquals(w.getNeighboursCount(), 4);

        cellsHealt = new boolean[]{
            LIVE, LIVE, LIVE,
            DEAD, LIVE, DEAD,
            DEAD, LIVE, LIVE,};

        w.fillNeighbours(cellsHealt);
        assertEquals(w.getNeighboursCount(), 5);

        cellsHealt = new boolean[]{
            LIVE, LIVE, LIVE,
            DEAD, LIVE, DEAD,
            LIVE, LIVE, LIVE,};

        w.fillNeighbours(cellsHealt);
        assertEquals(w.getNeighboursCount(), 6);

        cellsHealt = new boolean[]{
            LIVE, LIVE, LIVE,
            LIVE, DEAD, DEAD,
            LIVE, LIVE, LIVE,};

        w.fillNeighbours(cellsHealt);
        assertEquals(w.getNeighboursCount(), 7);

        cellsHealt = new boolean[]{
            LIVE, LIVE, LIVE,
            LIVE, LIVE, LIVE,
            LIVE, LIVE, LIVE,};

        w.fillNeighbours(cellsHealt);
        assertEquals(w.getNeighboursCount(), 8);
    }
}
