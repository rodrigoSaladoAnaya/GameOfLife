/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package game;

import java.util.Arrays;
import org.junit.*;
import static org.junit.Assert.*;

/**
 *
 * @author rsa
 */
public class PlayTest {

    private static boolean LIVE = true;
    private static boolean DEAD = false;
    private static int LENGTH = 3 - 1;

    public PlayTest() {
    }

    //@Test//Elimiar este test...
    public void testPrintBoard() {
        Play p = new Play();
        boolean[][] board = {
            {DEAD, DEAD, DEAD},
            {DEAD, DEAD, DEAD},
            {DEAD, DEAD, DEAD},};
        p.fillBoard(board);
    }

    //@Test
    public void testGetNeighboursByCell_min_min() {
        Play p = new Play();

        boolean[][] board = {
            {DEAD, DEAD, DEAD},
            {DEAD, DEAD, DEAD},
            {DEAD, DEAD, DEAD},};
        p.fillBoard(board);

        boolean[] neighbours = {
            DEAD, DEAD, DEAD,
            DEAD, DEAD, DEAD,
            DEAD, DEAD, DEAD};
        assertTrue(Arrays.equals(p.getNeighboursByCell(0, 0), neighbours));


        board = new boolean[][]{
            {DEAD, DEAD, DEAD},
            {DEAD, DEAD, DEAD},
            {DEAD, DEAD, LIVE},};
        p.fillBoard(board);

        neighbours = new boolean[]{
            LIVE, DEAD, DEAD,
            DEAD, DEAD, DEAD,
            DEAD, DEAD, DEAD};
        assertTrue(Arrays.equals(p.getNeighboursByCell(0, 0), neighbours));

        board = new boolean[][]{
            {DEAD, DEAD, DEAD},
            {DEAD, DEAD, DEAD},
            {LIVE, DEAD, LIVE},};
        p.fillBoard(board);

        neighbours = new boolean[]{
            LIVE, LIVE, DEAD,
            DEAD, DEAD, DEAD,
            DEAD, DEAD, DEAD};
        assertTrue(Arrays.equals(p.getNeighboursByCell(0, 0), neighbours));

        board = new boolean[][]{
            {DEAD, DEAD, DEAD},
            {DEAD, DEAD, DEAD},
            {LIVE, LIVE, LIVE},};
        p.fillBoard(board);

        neighbours = new boolean[]{
            LIVE, LIVE, LIVE,
            DEAD, DEAD, DEAD,
            DEAD, DEAD, DEAD};
        assertTrue(Arrays.equals(p.getNeighboursByCell(0, 0), neighbours));

        board = new boolean[][]{
            {DEAD, DEAD, LIVE},
            {DEAD, DEAD, DEAD},
            {LIVE, LIVE, LIVE},};
        p.fillBoard(board);

        neighbours = new boolean[]{
            LIVE, LIVE, LIVE,
            LIVE, DEAD, DEAD,
            DEAD, DEAD, DEAD};
        assertTrue(Arrays.equals(p.getNeighboursByCell(0, 0), neighbours));

        board = new boolean[][]{
            {LIVE, LIVE, LIVE},
            {DEAD, DEAD, DEAD},
            {LIVE, LIVE, LIVE},};
        p.fillBoard(board);

        neighbours = new boolean[]{
            LIVE, LIVE, LIVE,
            LIVE, LIVE, LIVE,
            DEAD, DEAD, DEAD};
        assertTrue(Arrays.equals(p.getNeighboursByCell(0, 0), neighbours));

        board = new boolean[][]{
            {LIVE, LIVE, LIVE},
            {DEAD, DEAD, LIVE},
            {LIVE, LIVE, LIVE},};
        p.fillBoard(board);

        neighbours = new boolean[]{
            LIVE, LIVE, LIVE,
            LIVE, LIVE, LIVE,
            LIVE, DEAD, DEAD};
        assertTrue(Arrays.equals(p.getNeighboursByCell(0, 0), neighbours));

        board = new boolean[][]{
            {LIVE, LIVE, LIVE},
            {LIVE, DEAD, LIVE},
            {LIVE, LIVE, LIVE},};
        p.fillBoard(board);

        neighbours = new boolean[]{
            LIVE, LIVE, LIVE,
            LIVE, LIVE, LIVE,
            LIVE, LIVE, DEAD};
        assertTrue(Arrays.equals(p.getNeighboursByCell(0, 0), neighbours));

        board = new boolean[][]{
            {LIVE, LIVE, LIVE},
            {LIVE, LIVE, LIVE},
            {LIVE, LIVE, LIVE},};
        p.fillBoard(board);

        neighbours = new boolean[]{
            LIVE, LIVE, LIVE,
            LIVE, LIVE, LIVE,
            LIVE, LIVE, LIVE};
        assertTrue(Arrays.equals(p.getNeighboursByCell(0, 0), neighbours));
    }

    @Test
    public void testGetNeighboursByCell_min_max() {
        Play p = new Play();

        boolean[][] board = {
            {DEAD, DEAD, DEAD},
            {DEAD, DEAD, DEAD},
            {DEAD, DEAD, DEAD},};
        p.fillBoard(board);

        boolean[] neighbours = {
            DEAD, DEAD, DEAD,
            DEAD, DEAD, DEAD,
            DEAD, DEAD, DEAD};
        assertTrue(Arrays.equals(p.getNeighboursByCell(0, LENGTH), neighbours));


        board = new boolean[][]{
            {DEAD, DEAD, DEAD},
            {DEAD, DEAD, DEAD},
            {DEAD, LIVE, DEAD},};
        p.fillBoard(board);

        neighbours = new boolean[]{
            LIVE, DEAD, DEAD,
            DEAD, DEAD, DEAD,
            DEAD, DEAD, DEAD};
        assertTrue(Arrays.equals(p.getNeighboursByCell(0, LENGTH), neighbours));
        
        board = new boolean[][]{
            {DEAD, DEAD, DEAD},
            {DEAD, DEAD, DEAD},
            {DEAD, LIVE, LIVE},};
        p.fillBoard(board);

        neighbours = new boolean[]{
            LIVE, LIVE, DEAD,
            DEAD, DEAD, DEAD,
            DEAD, DEAD, DEAD};
        assertTrue(Arrays.equals(p.getNeighboursByCell(0, LENGTH), neighbours));
        
        board = new boolean[][]{
            {DEAD, LIVE, DEAD},
            {DEAD, DEAD, DEAD},
            {LIVE, LIVE, LIVE},};
        p.fillBoard(board);

        neighbours = new boolean[]{
            LIVE, LIVE, LIVE,
            LIVE, DEAD, DEAD,
            DEAD, DEAD, DEAD};
        assertTrue(Arrays.equals(p.getNeighboursByCell(0, LENGTH), neighbours));
        
        board = new boolean[][]{
            {DEAD, LIVE, LIVE},
            {DEAD, DEAD, DEAD},
            {LIVE, LIVE, LIVE},};
        p.fillBoard(board);

        neighbours = new boolean[]{
            LIVE, LIVE, LIVE,
            LIVE, LIVE, DEAD,
            DEAD, DEAD, DEAD};
        assertTrue(Arrays.equals(p.getNeighboursByCell(0, LENGTH), neighbours));
        
        board = new boolean[][]{
            {LIVE, LIVE, LIVE},
            {DEAD, LIVE, DEAD},
            {LIVE, LIVE, LIVE},};
        p.fillBoard(board);

        neighbours = new boolean[]{
            LIVE, LIVE, LIVE,
            LIVE, LIVE, LIVE,
            LIVE, DEAD, DEAD};
        assertTrue(Arrays.equals(p.getNeighboursByCell(0, LENGTH), neighbours));
        
        board = new boolean[][]{
            {LIVE, LIVE, LIVE},
            {DEAD, LIVE, LIVE},
            {LIVE, LIVE, LIVE},};
        p.fillBoard(board);

        neighbours = new boolean[]{
            LIVE, LIVE, LIVE,
            LIVE, LIVE, LIVE,
            LIVE, LIVE, DEAD};
        assertTrue(Arrays.equals(p.getNeighboursByCell(0, LENGTH), neighbours));
        
        board = new boolean[][]{
            {LIVE, LIVE, LIVE},
            {LIVE, LIVE, LIVE},
            {LIVE, LIVE, LIVE},};
        p.fillBoard(board);

        neighbours = new boolean[]{
            LIVE, LIVE, LIVE,
            LIVE, LIVE, LIVE,
            LIVE, LIVE, LIVE};
        assertTrue(Arrays.equals(p.getNeighboursByCell(0, LENGTH), neighbours));
    }
    
    @Test
    public void testGetNeighboursByCell_max_min() {
        Play p = new Play();

        boolean[][] board = {
            {DEAD, DEAD, DEAD},
            {DEAD, DEAD, DEAD},
            {DEAD, DEAD, DEAD},};
        p.fillBoard(board);

        boolean[] neighbours = {
            DEAD, DEAD, DEAD,
            DEAD, DEAD, DEAD,
            DEAD, DEAD, DEAD};
        assertTrue(Arrays.equals(p.getNeighboursByCell(LENGTH, 0), neighbours));

        board = new boolean[][]{
            {DEAD, DEAD, DEAD},
            {DEAD, DEAD, LIVE},
            {DEAD, DEAD, DEAD},};
        p.fillBoard(board);

        neighbours = new boolean[]{
            LIVE, DEAD, DEAD,
            DEAD, DEAD, DEAD,
            DEAD, DEAD, DEAD};
        assertTrue(Arrays.equals(p.getNeighboursByCell(LENGTH, 0), neighbours));
        
        board = new boolean[][]{
            {DEAD, DEAD, DEAD},
            {LIVE, DEAD, LIVE},
            {DEAD, DEAD, DEAD},};
        p.fillBoard(board);

        neighbours = new boolean[]{
            LIVE, LIVE, DEAD,
            DEAD, DEAD, DEAD,
            DEAD, DEAD, DEAD};
        assertTrue(Arrays.equals(p.getNeighboursByCell(LENGTH, 0), neighbours));
        
        board = new boolean[][]{
            {DEAD, DEAD, DEAD},
            {LIVE, LIVE, LIVE},
            {DEAD, DEAD, DEAD},};
        p.fillBoard(board);

        neighbours = new boolean[]{
            LIVE, LIVE, LIVE,
            DEAD, DEAD, DEAD,
            DEAD, DEAD, DEAD};
        assertTrue(Arrays.equals(p.getNeighboursByCell(LENGTH, 0), neighbours));
        
        board = new boolean[][]{
            {DEAD, DEAD, DEAD},
            {LIVE, LIVE, LIVE},
            {DEAD, DEAD, LIVE},};
        p.fillBoard(board);

        neighbours = new boolean[]{
            LIVE, LIVE, LIVE,
            LIVE, DEAD, DEAD,
            DEAD, DEAD, DEAD};
        assertTrue(Arrays.equals(p.getNeighboursByCell(LENGTH, 0), neighbours));
        
        board = new boolean[][]{
            {DEAD, DEAD, DEAD},
            {LIVE, LIVE, LIVE},
            {LIVE, DEAD, LIVE},};
        p.fillBoard(board);

        neighbours = new boolean[]{
            LIVE, LIVE, LIVE,
            LIVE, LIVE, DEAD,
            DEAD, DEAD, DEAD};
        assertTrue(Arrays.equals(p.getNeighboursByCell(LENGTH, 0), neighbours));
        
        board = new boolean[][]{
            {DEAD, DEAD, DEAD},
            {LIVE, LIVE, LIVE},
            {LIVE, LIVE, LIVE},};
        p.fillBoard(board);

        neighbours = new boolean[]{
            LIVE, LIVE, LIVE,
            LIVE, LIVE, LIVE,
            DEAD, DEAD, DEAD};
        assertTrue(Arrays.equals(p.getNeighboursByCell(LENGTH, 0), neighbours));
        
        board = new boolean[][]{
            {DEAD, DEAD, LIVE},
            {LIVE, LIVE, LIVE},
            {LIVE, LIVE, LIVE},};
        p.fillBoard(board);

        neighbours = new boolean[]{
            LIVE, LIVE, LIVE,
            LIVE, LIVE, LIVE,
            LIVE, DEAD, DEAD};
        assertTrue(Arrays.equals(p.getNeighboursByCell(LENGTH, 0), neighbours));
        
        board = new boolean[][]{
            {LIVE, DEAD, LIVE},
            {LIVE, LIVE, LIVE},
            {LIVE, LIVE, LIVE},};
        p.fillBoard(board);

        neighbours = new boolean[]{
            LIVE, LIVE, LIVE,
            LIVE, LIVE, LIVE,
            LIVE, LIVE, DEAD};
        assertTrue(Arrays.equals(p.getNeighboursByCell(LENGTH, 0), neighbours));
        
        board = new boolean[][]{
            {LIVE, LIVE, LIVE},
            {LIVE, LIVE, LIVE},
            {LIVE, LIVE, LIVE},};
        p.fillBoard(board);

        neighbours = new boolean[]{
            LIVE, LIVE, LIVE,
            LIVE, LIVE, LIVE,
            LIVE, LIVE, LIVE};
        assertTrue(Arrays.equals(p.getNeighboursByCell(LENGTH, 0), neighbours));
    }
    
    @Test
    public void testGetNeighboursByCell_max_max() {
        Play p = new Play();

        boolean[][] board = {
            {DEAD, DEAD, DEAD},
            {DEAD, DEAD, DEAD},
            {DEAD, DEAD, DEAD},};
        p.fillBoard(board);

        boolean[] neighbours = {
            DEAD, DEAD, DEAD,
            DEAD, DEAD, DEAD,
            DEAD, DEAD, DEAD};
        assertTrue(Arrays.equals(p.getNeighboursByCell(LENGTH, LENGTH), neighbours));

        board = new boolean[][]{
            {DEAD, DEAD, DEAD},
            {DEAD, LIVE, DEAD},
            {DEAD, DEAD, DEAD},};
        p.fillBoard(board);

        neighbours = new boolean[]{
            LIVE, DEAD, DEAD,
            DEAD, DEAD, DEAD,
            DEAD, DEAD, DEAD};
        assertTrue(Arrays.equals(p.getNeighboursByCell(LENGTH, LENGTH), neighbours));
        
        board = new boolean[][]{
            {DEAD, DEAD, DEAD},
            {DEAD, LIVE, LIVE},
            {DEAD, DEAD, DEAD},};
        p.fillBoard(board);

        neighbours = new boolean[]{
            LIVE, LIVE, DEAD,
            DEAD, DEAD, DEAD,
            DEAD, DEAD, DEAD};
        assertTrue(Arrays.equals(p.getNeighboursByCell(LENGTH, LENGTH), neighbours));
        
        board = new boolean[][]{
            {DEAD, DEAD, DEAD},
            {LIVE, LIVE, LIVE},
            {DEAD, DEAD, DEAD},};
        p.fillBoard(board);

        neighbours = new boolean[]{
            LIVE, LIVE, LIVE,
            DEAD, DEAD, DEAD,
            DEAD, DEAD, DEAD};
        assertTrue(Arrays.equals(p.getNeighboursByCell(LENGTH, LENGTH), neighbours));
        
        board = new boolean[][]{
            {DEAD, DEAD, DEAD},
            {LIVE, LIVE, LIVE},
            {DEAD, LIVE, DEAD},};
        p.fillBoard(board);

        neighbours = new boolean[]{
            LIVE, LIVE, LIVE,
            LIVE, DEAD, DEAD,
            DEAD, DEAD, DEAD};
        assertTrue(Arrays.equals(p.getNeighboursByCell(LENGTH, LENGTH), neighbours));
        
        board = new boolean[][]{
            {DEAD, DEAD, DEAD},
            {LIVE, LIVE, LIVE},
            {DEAD, LIVE, LIVE},};
        p.fillBoard(board);

        neighbours = new boolean[]{
            LIVE, LIVE, LIVE,
            LIVE, LIVE, DEAD,
            DEAD, DEAD, DEAD};
        assertTrue(Arrays.equals(p.getNeighboursByCell(LENGTH, LENGTH), neighbours));
        
        board = new boolean[][]{
            {DEAD, DEAD, DEAD},
            {LIVE, LIVE, LIVE},
            {LIVE, LIVE, LIVE},};
        p.fillBoard(board);

        neighbours = new boolean[]{
            LIVE, LIVE, LIVE,
            LIVE, LIVE, LIVE,
            DEAD, DEAD, DEAD};
        assertTrue(Arrays.equals(p.getNeighboursByCell(LENGTH, LENGTH), neighbours));
        
        board = new boolean[][]{
            {DEAD, LIVE, DEAD},
            {LIVE, LIVE, LIVE},
            {LIVE, LIVE, LIVE},};
        p.fillBoard(board);

        neighbours = new boolean[]{
            LIVE, LIVE, LIVE,
            LIVE, LIVE, LIVE,
            LIVE, DEAD, DEAD};
        assertTrue(Arrays.equals(p.getNeighboursByCell(LENGTH, LENGTH), neighbours));
        
        board = new boolean[][]{
            {DEAD, LIVE, LIVE},
            {LIVE, LIVE, LIVE},
            {LIVE, LIVE, LIVE},};
        p.fillBoard(board);

        neighbours = new boolean[]{
            LIVE, LIVE, LIVE,
            LIVE, LIVE, LIVE,
            LIVE, LIVE, DEAD};
        assertTrue(Arrays.equals(p.getNeighboursByCell(LENGTH, LENGTH), neighbours));
        
        board = new boolean[][]{
            {LIVE, LIVE, LIVE},
            {LIVE, LIVE, LIVE},
            {LIVE, LIVE, LIVE},};
        p.fillBoard(board);

        neighbours = new boolean[]{
            LIVE, LIVE, LIVE,
            LIVE, LIVE, LIVE,
            LIVE, LIVE, LIVE};
        assertTrue(Arrays.equals(p.getNeighboursByCell(LENGTH, LENGTH), neighbours));
        
    }
}
