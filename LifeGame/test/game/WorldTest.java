/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package game;

import org.junit.*;
import static org.junit.Assert.*;

/**
 *
 * @author rsa
 */
public class WorldTest {

    private static final boolean LIVE = true;
    private static final boolean DEAD = false;

    public WorldTest() {
    }

    @Test
    public void testRules() {
        World w = new World();
        //1st rule
        assertEquals(w.getHealthApplyingRules(0, LIVE), false);
        assertEquals(w.getHealthApplyingRules(1, LIVE), false);

        //2nd rule
        assertEquals(w.getHealthApplyingRules(2, LIVE), true);
        assertEquals(w.getHealthApplyingRules(3, LIVE), true);

        //3rd rule
        assertEquals(w.getHealthApplyingRules(4, LIVE), false);
        assertEquals(w.getHealthApplyingRules(5, LIVE), false);
        assertEquals(w.getHealthApplyingRules(6, LIVE), false);
        assertEquals(w.getHealthApplyingRules(7, LIVE), false);
        assertEquals(w.getHealthApplyingRules(8, LIVE), false);

        //4th rule
        assertEquals(w.getHealthApplyingRules(3, LIVE), true);

        //test False
        assertEquals(w.getHealthApplyingRules(0, DEAD), false);
        assertEquals(w.getHealthApplyingRules(1, DEAD), false);
        assertEquals(w.getHealthApplyingRules(2, DEAD), false);
        assertEquals(w.getHealthApplyingRules(4, DEAD), false);
        assertEquals(w.getHealthApplyingRules(5, DEAD), false);
        assertEquals(w.getHealthApplyingRules(6, DEAD), false);
        assertEquals(w.getHealthApplyingRules(7, DEAD), false);
        assertEquals(w.getHealthApplyingRules(8, DEAD), false);
    }

    @Test
    public void testGetCellHealt() {
        World w = new World();

        boolean[] cellsHealt = {
            DEAD, DEAD, DEAD,
            DEAD, LIVE, DEAD,
            DEAD, DEAD, DEAD,};
        w.fillBoard(cellsHealt);
        assertEquals(w.getCellHealth(), LIVE);

        cellsHealt = new boolean[]{
            DEAD, DEAD, DEAD,
            DEAD, DEAD, DEAD,
            DEAD, DEAD, DEAD,};
        w.fillBoard(cellsHealt);
        assertEquals(w.getCellHealth(), DEAD);
    }

    @Test
    public void testGetNeighboursCountgetNeighboursCount() {
        World w = new World();

        boolean[] cellsHealt = {
            DEAD, DEAD, DEAD,
            DEAD, LIVE, DEAD,
            DEAD, DEAD, DEAD,};
        w.fillBoard(cellsHealt);
        assertEquals(w.getNeighboursCount(), 0);


        cellsHealt = new boolean[]{
            LIVE, DEAD, DEAD,
            DEAD, LIVE, DEAD,
            DEAD, DEAD, DEAD,};

        w.fillBoard(cellsHealt);
        assertEquals(w.getNeighboursCount(), 1);

        cellsHealt = new boolean[]{
            LIVE, DEAD, DEAD,
            DEAD, LIVE, DEAD,
            DEAD, DEAD, LIVE,};

        w.fillBoard(cellsHealt);
        assertEquals(w.getNeighboursCount(), 2);

        cellsHealt = new boolean[]{
            LIVE, LIVE, DEAD,
            DEAD, DEAD, DEAD,
            DEAD, DEAD, LIVE,};

        w.fillBoard(cellsHealt);
        assertEquals(w.getNeighboursCount(), 3);

        cellsHealt = new boolean[]{
            LIVE, LIVE, DEAD,
            DEAD, DEAD, DEAD,
            DEAD, LIVE, LIVE,};

        w.fillBoard(cellsHealt);
        assertEquals(w.getNeighboursCount(), 4);

        cellsHealt = new boolean[]{
            LIVE, LIVE, LIVE,
            DEAD, LIVE, DEAD,
            DEAD, LIVE, LIVE,};

        w.fillBoard(cellsHealt);
        assertEquals(w.getNeighboursCount(), 5);

        cellsHealt = new boolean[]{
            LIVE, LIVE, LIVE,
            DEAD, LIVE, DEAD,
            LIVE, LIVE, LIVE,};

        w.fillBoard(cellsHealt);
        assertEquals(w.getNeighboursCount(), 6);

        cellsHealt = new boolean[]{
            LIVE, LIVE, LIVE,
            LIVE, DEAD, DEAD,
            LIVE, LIVE, LIVE,};

        w.fillBoard(cellsHealt);
        assertEquals(w.getNeighboursCount(), 7);

        cellsHealt = new boolean[]{
            LIVE, LIVE, LIVE,
            LIVE, LIVE, LIVE,
            LIVE, LIVE, LIVE,};

        w.fillBoard(cellsHealt);
        assertEquals(w.getNeighboursCount(), 8);
    }
}
