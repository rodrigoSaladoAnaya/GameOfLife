/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package game;

import java.util.Arrays;
import org.junit.*;
import static org.junit.Assert.*;

/**
 * @author rodrigo salado anaya
 */
public class BoardTest {

    private static final boolean LIVE = true;
    private static final boolean DEAD = false;
    private static final int LENGTH = 3 - 1;

    public BoardTest() {
    }

    @Test
    public void testGetNeighboursByCell_min_min() {
        Board p = new Board();
        p.setLength(3);

        boolean[] neighbours = {
            DEAD, DEAD, DEAD,
            DEAD, DEAD, DEAD,
            DEAD, DEAD, DEAD};
        boolean[][] board = {
            {DEAD, DEAD, DEAD},
            {DEAD, DEAD, DEAD},
            {DEAD, DEAD, DEAD},};
        p.fillBoard(board);
        assertTrue(Arrays.equals(p.getNeighboursByCell(0, 0), neighbours));

        neighbours = new boolean[]{
            LIVE, DEAD, DEAD,
            DEAD, DEAD, DEAD,
            DEAD, DEAD, DEAD};
        board = new boolean[][]{
            {DEAD, DEAD, DEAD},
            {DEAD, DEAD, DEAD},
            {DEAD, DEAD, LIVE},};
        p.fillBoard(board);
        assertTrue(Arrays.equals(p.getNeighboursByCell(0, 0), neighbours));

        neighbours = new boolean[]{
            LIVE, LIVE, DEAD,
            DEAD, DEAD, DEAD,
            DEAD, DEAD, DEAD};
        board = new boolean[][]{
            {DEAD, DEAD, DEAD},
            {DEAD, DEAD, DEAD},
            {LIVE, DEAD, LIVE},};
        p.fillBoard(board);
        assertTrue(Arrays.equals(p.getNeighboursByCell(0, 0), neighbours));

        neighbours = new boolean[]{
            LIVE, LIVE, LIVE,
            DEAD, DEAD, DEAD,
            DEAD, DEAD, DEAD};
        board = new boolean[][]{
            {DEAD, DEAD, DEAD},
            {DEAD, DEAD, DEAD},
            {LIVE, LIVE, LIVE},};
        p.fillBoard(board);
        assertTrue(Arrays.equals(p.getNeighboursByCell(0, 0), neighbours));

        neighbours = new boolean[]{
            LIVE, LIVE, LIVE,
            LIVE, DEAD, DEAD,
            DEAD, DEAD, DEAD};
        board = new boolean[][]{
            {DEAD, DEAD, LIVE},
            {DEAD, DEAD, DEAD},
            {LIVE, LIVE, LIVE},};
        p.fillBoard(board);
        assertTrue(Arrays.equals(p.getNeighboursByCell(0, 0), neighbours));

        neighbours = new boolean[]{
            LIVE, LIVE, LIVE,
            LIVE, LIVE, LIVE,
            DEAD, DEAD, DEAD};
        board = new boolean[][]{
            {LIVE, LIVE, LIVE},
            {DEAD, DEAD, DEAD},
            {LIVE, LIVE, LIVE},};
        p.fillBoard(board);
        assertTrue(Arrays.equals(p.getNeighboursByCell(0, 0), neighbours));

        neighbours = new boolean[]{
            LIVE, LIVE, LIVE,
            LIVE, LIVE, LIVE,
            LIVE, DEAD, DEAD};
        board = new boolean[][]{
            {LIVE, LIVE, LIVE},
            {DEAD, DEAD, LIVE},
            {LIVE, LIVE, LIVE},};
        p.fillBoard(board);
        assertTrue(Arrays.equals(p.getNeighboursByCell(0, 0), neighbours));

        neighbours = new boolean[]{
            LIVE, LIVE, LIVE,
            LIVE, LIVE, LIVE,
            LIVE, LIVE, DEAD};
        board = new boolean[][]{
            {LIVE, LIVE, LIVE},
            {LIVE, DEAD, LIVE},
            {LIVE, LIVE, LIVE},};
        p.fillBoard(board);
        assertTrue(Arrays.equals(p.getNeighboursByCell(0, 0), neighbours));

        neighbours = new boolean[]{
            LIVE, LIVE, LIVE,
            LIVE, LIVE, LIVE,
            LIVE, LIVE, LIVE};
        board = new boolean[][]{
            {LIVE, LIVE, LIVE},
            {LIVE, LIVE, LIVE},
            {LIVE, LIVE, LIVE},};
        p.fillBoard(board);
        assertTrue(Arrays.equals(p.getNeighboursByCell(0, 0), neighbours));
    }

    @Test
    public void testGetNeighboursByCell_min_max() {
        Board p = new Board();
        p.setLength(3);

        boolean[] neighbours = {
            DEAD, DEAD, DEAD,
            DEAD, DEAD, DEAD,
            DEAD, DEAD, DEAD};
        boolean[][] board = {
            {DEAD, DEAD, DEAD},
            {DEAD, DEAD, DEAD},
            {DEAD, DEAD, DEAD},};
        p.fillBoard(board);
        assertTrue(Arrays.equals(p.getNeighboursByCell(0, LENGTH), neighbours));

        neighbours = new boolean[]{
            LIVE, DEAD, DEAD,
            DEAD, DEAD, DEAD,
            DEAD, DEAD, DEAD};
        board = new boolean[][]{
            {DEAD, DEAD, DEAD},
            {DEAD, DEAD, DEAD},
            {DEAD, LIVE, DEAD},};
        p.fillBoard(board);
        assertTrue(Arrays.equals(p.getNeighboursByCell(0, LENGTH), neighbours));

        neighbours = new boolean[]{
            LIVE, LIVE, DEAD,
            DEAD, DEAD, DEAD,
            DEAD, DEAD, DEAD};
        board = new boolean[][]{
            {DEAD, DEAD, DEAD},
            {DEAD, DEAD, DEAD},
            {DEAD, LIVE, LIVE},};
        p.fillBoard(board);
        assertTrue(Arrays.equals(p.getNeighboursByCell(0, LENGTH), neighbours));

        neighbours = new boolean[]{
            LIVE, LIVE, LIVE,
            LIVE, DEAD, DEAD,
            DEAD, DEAD, DEAD};
        board = new boolean[][]{
            {DEAD, LIVE, DEAD},
            {DEAD, DEAD, DEAD},
            {LIVE, LIVE, LIVE},};
        p.fillBoard(board);
        assertTrue(Arrays.equals(p.getNeighboursByCell(0, LENGTH), neighbours));

        neighbours = new boolean[]{
            LIVE, LIVE, LIVE,
            LIVE, LIVE, DEAD,
            DEAD, DEAD, DEAD};
        board = new boolean[][]{
            {DEAD, LIVE, LIVE},
            {DEAD, DEAD, DEAD},
            {LIVE, LIVE, LIVE},};
        p.fillBoard(board);
        assertTrue(Arrays.equals(p.getNeighboursByCell(0, LENGTH), neighbours));

        neighbours = new boolean[]{
            LIVE, LIVE, LIVE,
            LIVE, LIVE, LIVE,
            LIVE, DEAD, DEAD};
        board = new boolean[][]{
            {LIVE, LIVE, LIVE},
            {DEAD, LIVE, DEAD},
            {LIVE, LIVE, LIVE},};
        p.fillBoard(board);
        assertTrue(Arrays.equals(p.getNeighboursByCell(0, LENGTH), neighbours));

        neighbours = new boolean[]{
            LIVE, LIVE, LIVE,
            LIVE, LIVE, LIVE,
            LIVE, LIVE, DEAD};
        board = new boolean[][]{
            {LIVE, LIVE, LIVE},
            {DEAD, LIVE, LIVE},
            {LIVE, LIVE, LIVE},};
        p.fillBoard(board);
        assertTrue(Arrays.equals(p.getNeighboursByCell(0, LENGTH), neighbours));

        neighbours = new boolean[]{
            LIVE, LIVE, LIVE,
            LIVE, LIVE, LIVE,
            LIVE, LIVE, LIVE};
        board = new boolean[][]{
            {LIVE, LIVE, LIVE},
            {LIVE, LIVE, LIVE},
            {LIVE, LIVE, LIVE},};
        p.fillBoard(board);
        assertTrue(Arrays.equals(p.getNeighboursByCell(0, LENGTH), neighbours));
    }

    @Test
    public void testGetNeighboursByCell_max_min() {
        Board p = new Board();
        p.setLength(3);

        boolean[] neighbours = {
            DEAD, DEAD, DEAD,
            DEAD, DEAD, DEAD,
            DEAD, DEAD, DEAD};
        boolean[][] board = {
            {DEAD, DEAD, DEAD},
            {DEAD, DEAD, DEAD},
            {DEAD, DEAD, DEAD},};
        p.fillBoard(board);
        assertTrue(Arrays.equals(p.getNeighboursByCell(LENGTH, 0), neighbours));

        neighbours = new boolean[]{
            LIVE, DEAD, DEAD,
            DEAD, DEAD, DEAD,
            DEAD, DEAD, DEAD};
        board = new boolean[][]{
            {DEAD, DEAD, DEAD},
            {DEAD, DEAD, LIVE},
            {DEAD, DEAD, DEAD},};
        p.fillBoard(board);
        assertTrue(Arrays.equals(p.getNeighboursByCell(LENGTH, 0), neighbours));

        neighbours = new boolean[]{
            LIVE, LIVE, DEAD,
            DEAD, DEAD, DEAD,
            DEAD, DEAD, DEAD};
        board = new boolean[][]{
            {DEAD, DEAD, DEAD},
            {LIVE, DEAD, LIVE},
            {DEAD, DEAD, DEAD},};
        p.fillBoard(board);
        assertTrue(Arrays.equals(p.getNeighboursByCell(LENGTH, 0), neighbours));

        neighbours = new boolean[]{
            LIVE, LIVE, LIVE,
            DEAD, DEAD, DEAD,
            DEAD, DEAD, DEAD};
        board = new boolean[][]{
            {DEAD, DEAD, DEAD},
            {LIVE, LIVE, LIVE},
            {DEAD, DEAD, DEAD},};
        p.fillBoard(board);
        assertTrue(Arrays.equals(p.getNeighboursByCell(LENGTH, 0), neighbours));

        neighbours = new boolean[]{
            LIVE, LIVE, LIVE,
            LIVE, DEAD, DEAD,
            DEAD, DEAD, DEAD};
        board = new boolean[][]{
            {DEAD, DEAD, DEAD},
            {LIVE, LIVE, LIVE},
            {DEAD, DEAD, LIVE},};
        p.fillBoard(board);
        assertTrue(Arrays.equals(p.getNeighboursByCell(LENGTH, 0), neighbours));

        neighbours = new boolean[]{
            LIVE, LIVE, LIVE,
            LIVE, LIVE, DEAD,
            DEAD, DEAD, DEAD};
        board = new boolean[][]{
            {DEAD, DEAD, DEAD},
            {LIVE, LIVE, LIVE},
            {LIVE, DEAD, LIVE},};
        p.fillBoard(board);
        assertTrue(Arrays.equals(p.getNeighboursByCell(LENGTH, 0), neighbours));

        neighbours = new boolean[]{
            LIVE, LIVE, LIVE,
            LIVE, LIVE, LIVE,
            DEAD, DEAD, DEAD};
        board = new boolean[][]{
            {DEAD, DEAD, DEAD},
            {LIVE, LIVE, LIVE},
            {LIVE, LIVE, LIVE},};
        p.fillBoard(board);
        assertTrue(Arrays.equals(p.getNeighboursByCell(LENGTH, 0), neighbours));

        neighbours = new boolean[]{
            LIVE, LIVE, LIVE,
            LIVE, LIVE, LIVE,
            LIVE, DEAD, DEAD};
        board = new boolean[][]{
            {DEAD, DEAD, LIVE},
            {LIVE, LIVE, LIVE},
            {LIVE, LIVE, LIVE},};
        p.fillBoard(board);
        assertTrue(Arrays.equals(p.getNeighboursByCell(LENGTH, 0), neighbours));

        neighbours = new boolean[]{
            LIVE, LIVE, LIVE,
            LIVE, LIVE, LIVE,
            LIVE, LIVE, DEAD};
        board = new boolean[][]{
            {LIVE, DEAD, LIVE},
            {LIVE, LIVE, LIVE},
            {LIVE, LIVE, LIVE},};
        p.fillBoard(board);
        assertTrue(Arrays.equals(p.getNeighboursByCell(LENGTH, 0), neighbours));

        neighbours = new boolean[]{
            LIVE, LIVE, LIVE,
            LIVE, LIVE, LIVE,
            LIVE, LIVE, LIVE};
        board = new boolean[][]{
            {LIVE, LIVE, LIVE},
            {LIVE, LIVE, LIVE},
            {LIVE, LIVE, LIVE},};
        p.fillBoard(board);
        assertTrue(Arrays.equals(p.getNeighboursByCell(LENGTH, 0), neighbours));
    }

    @Test
    public void testGetNeighboursByCell_max_max() {
        Board p = new Board();
        p.setLength(3);

        boolean[] neighbours = {
            DEAD, DEAD, DEAD,
            DEAD, DEAD, DEAD,
            DEAD, DEAD, DEAD};
        boolean[][] board = {
            {DEAD, DEAD, DEAD},
            {DEAD, DEAD, DEAD},
            {DEAD, DEAD, DEAD},};
        p.fillBoard(board);
        assertTrue(Arrays.equals(p.getNeighboursByCell(LENGTH, LENGTH), neighbours));

        neighbours = new boolean[]{
            LIVE, DEAD, DEAD,
            DEAD, DEAD, DEAD,
            DEAD, DEAD, DEAD};
        board = new boolean[][]{
            {DEAD, DEAD, DEAD},
            {DEAD, LIVE, DEAD},
            {DEAD, DEAD, DEAD},};
        p.fillBoard(board);
        assertTrue(Arrays.equals(p.getNeighboursByCell(LENGTH, LENGTH), neighbours));

        neighbours = new boolean[]{
            LIVE, LIVE, DEAD,
            DEAD, DEAD, DEAD,
            DEAD, DEAD, DEAD};
        board = new boolean[][]{
            {DEAD, DEAD, DEAD},
            {DEAD, LIVE, LIVE},
            {DEAD, DEAD, DEAD},};
        p.fillBoard(board);
        assertTrue(Arrays.equals(p.getNeighboursByCell(LENGTH, LENGTH), neighbours));

        neighbours = new boolean[]{
            LIVE, LIVE, LIVE,
            DEAD, DEAD, DEAD,
            DEAD, DEAD, DEAD};
        board = new boolean[][]{
            {DEAD, DEAD, DEAD},
            {LIVE, LIVE, LIVE},
            {DEAD, DEAD, DEAD},};
        p.fillBoard(board);
        assertTrue(Arrays.equals(p.getNeighboursByCell(LENGTH, LENGTH), neighbours));

        neighbours = new boolean[]{
            LIVE, LIVE, LIVE,
            LIVE, DEAD, DEAD,
            DEAD, DEAD, DEAD};
        board = new boolean[][]{
            {DEAD, DEAD, DEAD},
            {LIVE, LIVE, LIVE},
            {DEAD, LIVE, DEAD},};
        p.fillBoard(board);
        assertTrue(Arrays.equals(p.getNeighboursByCell(LENGTH, LENGTH), neighbours));

        neighbours = new boolean[]{
            LIVE, LIVE, LIVE,
            LIVE, LIVE, DEAD,
            DEAD, DEAD, DEAD};
        board = new boolean[][]{
            {DEAD, DEAD, DEAD},
            {LIVE, LIVE, LIVE},
            {DEAD, LIVE, LIVE},};
        p.fillBoard(board);
        assertTrue(Arrays.equals(p.getNeighboursByCell(LENGTH, LENGTH), neighbours));

        neighbours = new boolean[]{
            LIVE, LIVE, LIVE,
            LIVE, LIVE, LIVE,
            DEAD, DEAD, DEAD};
        board = new boolean[][]{
            {DEAD, DEAD, DEAD},
            {LIVE, LIVE, LIVE},
            {LIVE, LIVE, LIVE},};
        p.fillBoard(board);
        assertTrue(Arrays.equals(p.getNeighboursByCell(LENGTH, LENGTH), neighbours));

        neighbours = new boolean[]{
            LIVE, LIVE, LIVE,
            LIVE, LIVE, LIVE,
            LIVE, DEAD, DEAD};
        board = new boolean[][]{
            {DEAD, LIVE, DEAD},
            {LIVE, LIVE, LIVE},
            {LIVE, LIVE, LIVE},};
        p.fillBoard(board);
        assertTrue(Arrays.equals(p.getNeighboursByCell(LENGTH, LENGTH), neighbours));

        neighbours = new boolean[]{
            LIVE, LIVE, LIVE,
            LIVE, LIVE, LIVE,
            LIVE, LIVE, DEAD};
        board = new boolean[][]{
            {DEAD, LIVE, LIVE},
            {LIVE, LIVE, LIVE},
            {LIVE, LIVE, LIVE},};
        p.fillBoard(board);
        assertTrue(Arrays.equals(p.getNeighboursByCell(LENGTH, LENGTH), neighbours));

        neighbours = new boolean[]{
            LIVE, LIVE, LIVE,
            LIVE, LIVE, LIVE,
            LIVE, LIVE, LIVE};
        board = new boolean[][]{
            {LIVE, LIVE, LIVE},
            {LIVE, LIVE, LIVE},
            {LIVE, LIVE, LIVE},};
        p.fillBoard(board);
        assertTrue(Arrays.equals(p.getNeighboursByCell(LENGTH, LENGTH), neighbours));
    }

    @Test
    public void testGetNeighboursByCell_left() {
        Board p = new Board();
        p.setLength(3);

        boolean[] neighbours = {
            DEAD, DEAD, DEAD,
            DEAD, DEAD, DEAD,
            DEAD, DEAD, DEAD};
        boolean[][] board = {
            {DEAD, DEAD, DEAD},
            {DEAD, DEAD, DEAD},
            {DEAD, DEAD, DEAD},};
        p.fillBoard(board);
        assertTrue(Arrays.equals(p.getNeighboursByCell(1, 0), neighbours));

        neighbours = new boolean[]{
            LIVE, DEAD, DEAD,
            DEAD, DEAD, DEAD,
            DEAD, DEAD, DEAD};
        board = new boolean[][]{
            {DEAD, DEAD, LIVE},
            {DEAD, DEAD, DEAD},
            {DEAD, DEAD, DEAD},};
        p.fillBoard(board);
        assertTrue(Arrays.equals(p.getNeighboursByCell(1, 0), neighbours));

        neighbours = new boolean[]{
            LIVE, LIVE, DEAD,
            DEAD, DEAD, DEAD,
            DEAD, DEAD, DEAD};
        board = new boolean[][]{
            {LIVE, DEAD, LIVE},
            {DEAD, DEAD, DEAD},
            {DEAD, DEAD, DEAD},};
        p.fillBoard(board);
        assertTrue(Arrays.equals(p.getNeighboursByCell(1, 0), neighbours));

        neighbours = new boolean[]{
            LIVE, LIVE, DEAD,
            DEAD, DEAD, DEAD,
            DEAD, DEAD, DEAD};
        board = new boolean[][]{
            {LIVE, DEAD, LIVE},
            {DEAD, DEAD, DEAD},
            {DEAD, DEAD, DEAD},};
        p.fillBoard(board);
        assertTrue(Arrays.equals(p.getNeighboursByCell(1, 0), neighbours));

        neighbours = new boolean[]{
            LIVE, LIVE, LIVE,
            DEAD, DEAD, DEAD,
            DEAD, DEAD, DEAD};
        board = new boolean[][]{
            {LIVE, LIVE, LIVE},
            {DEAD, DEAD, DEAD},
            {DEAD, DEAD, DEAD},};
        p.fillBoard(board);
        assertTrue(Arrays.equals(p.getNeighboursByCell(1, 0), neighbours));

        neighbours = new boolean[]{
            LIVE, LIVE, LIVE,
            LIVE, DEAD, DEAD,
            DEAD, DEAD, DEAD};
        board = new boolean[][]{
            {LIVE, LIVE, LIVE},
            {DEAD, DEAD, LIVE},
            {DEAD, DEAD, DEAD},};
        p.fillBoard(board);
        assertTrue(Arrays.equals(p.getNeighboursByCell(1, 0), neighbours));

        neighbours = new boolean[]{
            LIVE, LIVE, LIVE,
            LIVE, LIVE, DEAD,
            DEAD, DEAD, DEAD};
        board = new boolean[][]{
            {LIVE, LIVE, LIVE},
            {LIVE, DEAD, LIVE},
            {DEAD, DEAD, DEAD},};
        p.fillBoard(board);
        assertTrue(Arrays.equals(p.getNeighboursByCell(1, 0), neighbours));

        neighbours = new boolean[]{
            LIVE, LIVE, LIVE,
            LIVE, LIVE, LIVE,
            DEAD, DEAD, DEAD};
        board = new boolean[][]{
            {LIVE, LIVE, LIVE},
            {LIVE, LIVE, LIVE},
            {DEAD, DEAD, DEAD},};
        p.fillBoard(board);
        assertTrue(Arrays.equals(p.getNeighboursByCell(1, 0), neighbours));

        neighbours = new boolean[]{
            LIVE, LIVE, LIVE,
            LIVE, LIVE, LIVE,
            LIVE, DEAD, DEAD};
        board = new boolean[][]{
            {LIVE, LIVE, LIVE},
            {LIVE, LIVE, LIVE},
            {DEAD, DEAD, LIVE},};
        p.fillBoard(board);
        assertTrue(Arrays.equals(p.getNeighboursByCell(1, 0), neighbours));

        neighbours = new boolean[]{
            LIVE, LIVE, LIVE,
            LIVE, LIVE, LIVE,
            LIVE, LIVE, DEAD};
        board = new boolean[][]{
            {LIVE, LIVE, LIVE},
            {LIVE, LIVE, LIVE},
            {LIVE, DEAD, LIVE},};
        p.fillBoard(board);
        assertTrue(Arrays.equals(p.getNeighboursByCell(1, 0), neighbours));

        neighbours = new boolean[]{
            LIVE, LIVE, LIVE,
            LIVE, LIVE, LIVE,
            LIVE, LIVE, LIVE};
        board = new boolean[][]{
            {LIVE, LIVE, LIVE},
            {LIVE, LIVE, LIVE},
            {LIVE, LIVE, LIVE},};
        p.fillBoard(board);
        assertTrue(Arrays.equals(p.getNeighboursByCell(1, 0), neighbours));
    }

    @Test
    public void testGetNeighboursByCell_right() {
        Board p = new Board();
        p.setLength(3);

        boolean[] neighbours = {
            DEAD, DEAD, DEAD,
            DEAD, DEAD, DEAD,
            DEAD, DEAD, DEAD};
        boolean[][] board = {
            {DEAD, DEAD, DEAD},
            {DEAD, DEAD, DEAD},
            {DEAD, DEAD, DEAD},};
        p.fillBoard(board);
        assertTrue(Arrays.equals(p.getNeighboursByCell(1, LENGTH), neighbours));

        neighbours = new boolean[]{
            LIVE, DEAD, DEAD,
            DEAD, DEAD, DEAD,
            DEAD, DEAD, DEAD};
        board = new boolean[][]{
            {DEAD, LIVE, DEAD},
            {DEAD, DEAD, DEAD},
            {DEAD, DEAD, DEAD},};
        p.fillBoard(board);
        assertTrue(Arrays.equals(p.getNeighboursByCell(1, LENGTH), neighbours));

        neighbours = new boolean[]{
            LIVE, LIVE, DEAD,
            DEAD, DEAD, DEAD,
            DEAD, DEAD, DEAD};
        board = new boolean[][]{
            {DEAD, LIVE, LIVE},
            {DEAD, DEAD, DEAD},
            {DEAD, DEAD, DEAD},};
        p.fillBoard(board);
        assertTrue(Arrays.equals(p.getNeighboursByCell(1, LENGTH), neighbours));

        neighbours = new boolean[]{
            LIVE, LIVE, LIVE,
            DEAD, DEAD, DEAD,
            DEAD, DEAD, DEAD};
        board = new boolean[][]{
            {LIVE, LIVE, LIVE},
            {DEAD, DEAD, DEAD},
            {DEAD, DEAD, DEAD},};
        p.fillBoard(board);
        assertTrue(Arrays.equals(p.getNeighboursByCell(1, LENGTH), neighbours));

        neighbours = new boolean[]{
            LIVE, LIVE, LIVE,
            LIVE, DEAD, DEAD,
            DEAD, DEAD, DEAD};
        board = new boolean[][]{
            {LIVE, LIVE, LIVE},
            {DEAD, LIVE, DEAD},
            {DEAD, DEAD, DEAD},};
        p.fillBoard(board);
        assertTrue(Arrays.equals(p.getNeighboursByCell(1, LENGTH), neighbours));

        neighbours = new boolean[]{
            LIVE, LIVE, LIVE,
            LIVE, LIVE, DEAD,
            DEAD, DEAD, DEAD};
        board = new boolean[][]{
            {LIVE, LIVE, LIVE},
            {DEAD, LIVE, LIVE},
            {DEAD, DEAD, DEAD},};
        p.fillBoard(board);
        assertTrue(Arrays.equals(p.getNeighboursByCell(1, LENGTH), neighbours));

        neighbours = new boolean[]{
            LIVE, LIVE, LIVE,
            LIVE, LIVE, LIVE,
            DEAD, DEAD, DEAD};
        board = new boolean[][]{
            {LIVE, LIVE, LIVE},
            {LIVE, LIVE, LIVE},
            {DEAD, DEAD, DEAD},};
        p.fillBoard(board);
        assertTrue(Arrays.equals(p.getNeighboursByCell(1, LENGTH), neighbours));

        neighbours = new boolean[]{
            LIVE, LIVE, LIVE,
            LIVE, LIVE, LIVE,
            LIVE, DEAD, DEAD};
        board = new boolean[][]{
            {LIVE, LIVE, LIVE},
            {LIVE, LIVE, LIVE},
            {DEAD, LIVE, DEAD},};
        p.fillBoard(board);
        assertTrue(Arrays.equals(p.getNeighboursByCell(1, LENGTH), neighbours));

        neighbours = new boolean[]{
            LIVE, LIVE, LIVE,
            LIVE, LIVE, LIVE,
            LIVE, LIVE, DEAD};
        board = new boolean[][]{
            {LIVE, LIVE, LIVE},
            {LIVE, LIVE, LIVE},
            {DEAD, LIVE, LIVE},};
        p.fillBoard(board);
        assertTrue(Arrays.equals(p.getNeighboursByCell(1, LENGTH), neighbours));

        neighbours = new boolean[]{
            LIVE, LIVE, LIVE,
            LIVE, LIVE, LIVE,
            LIVE, LIVE, LIVE};
        board = new boolean[][]{
            {LIVE, LIVE, LIVE},
            {LIVE, LIVE, LIVE},
            {LIVE, LIVE, LIVE},};
        p.fillBoard(board);
        assertTrue(Arrays.equals(p.getNeighboursByCell(1, LENGTH), neighbours));
    }

    @Test
    public void testGetNeighboursByCell_bottom() {
        Board p = new Board();
        p.setLength(3);

        boolean[] neighbours = {
            DEAD, DEAD, DEAD,
            DEAD, DEAD, DEAD,
            DEAD, DEAD, DEAD};
        boolean[][] board = {
            {DEAD, DEAD, DEAD},
            {DEAD, DEAD, DEAD},
            {DEAD, DEAD, DEAD},};
        p.fillBoard(board);
        assertTrue(Arrays.equals(p.getNeighboursByCell(LENGTH, 1), neighbours));

        neighbours = new boolean[]{
            LIVE, DEAD, DEAD,
            DEAD, DEAD, DEAD,
            DEAD, DEAD, DEAD};
        board = new boolean[][]{
            {DEAD, DEAD, DEAD},
            {LIVE, DEAD, DEAD},
            {DEAD, DEAD, DEAD},};
        p.fillBoard(board);
        assertTrue(Arrays.equals(p.getNeighboursByCell(LENGTH, 1), neighbours));

        neighbours = new boolean[]{
            LIVE, LIVE, DEAD,
            DEAD, DEAD, DEAD,
            DEAD, DEAD, DEAD};
        board = new boolean[][]{
            {DEAD, DEAD, DEAD},
            {LIVE, LIVE, DEAD},
            {DEAD, DEAD, DEAD},};
        p.fillBoard(board);
        assertTrue(Arrays.equals(p.getNeighboursByCell(LENGTH, 1), neighbours));

        neighbours = new boolean[]{
            LIVE, LIVE, LIVE,
            DEAD, DEAD, DEAD,
            DEAD, DEAD, DEAD};
        board = new boolean[][]{
            {DEAD, DEAD, DEAD},
            {LIVE, LIVE, LIVE},
            {DEAD, DEAD, DEAD},};
        p.fillBoard(board);
        assertTrue(Arrays.equals(p.getNeighboursByCell(LENGTH, 1), neighbours));

        neighbours = new boolean[]{
            LIVE, LIVE, LIVE,
            LIVE, DEAD, DEAD,
            DEAD, DEAD, DEAD};
        board = new boolean[][]{
            {DEAD, DEAD, DEAD},
            {LIVE, LIVE, LIVE},
            {LIVE, DEAD, DEAD},};
        p.fillBoard(board);
        assertTrue(Arrays.equals(p.getNeighboursByCell(LENGTH, 1), neighbours));

        neighbours = new boolean[]{
            LIVE, LIVE, LIVE,
            LIVE, LIVE, DEAD,
            DEAD, DEAD, DEAD};
        board = new boolean[][]{
            {DEAD, DEAD, DEAD},
            {LIVE, LIVE, LIVE},
            {LIVE, LIVE, DEAD},};
        p.fillBoard(board);
        assertTrue(Arrays.equals(p.getNeighboursByCell(LENGTH, 1), neighbours));

        neighbours = new boolean[]{
            LIVE, LIVE, LIVE,
            LIVE, LIVE, LIVE,
            LIVE, DEAD, DEAD};
        board = new boolean[][]{
            {LIVE, DEAD, DEAD},
            {LIVE, LIVE, LIVE},
            {LIVE, LIVE, LIVE},};
        p.fillBoard(board);
        assertTrue(Arrays.equals(p.getNeighboursByCell(LENGTH, 1), neighbours));

        neighbours = new boolean[]{
            LIVE, LIVE, LIVE,
            LIVE, LIVE, LIVE,
            LIVE, LIVE, DEAD};
        board = new boolean[][]{
            {LIVE, LIVE, DEAD},
            {LIVE, LIVE, LIVE},
            {LIVE, LIVE, LIVE},};
        p.fillBoard(board);
        assertTrue(Arrays.equals(p.getNeighboursByCell(LENGTH, 1), neighbours));

        neighbours = new boolean[]{
            LIVE, LIVE, LIVE,
            LIVE, LIVE, LIVE,
            LIVE, LIVE, LIVE};
        board = new boolean[][]{
            {LIVE, LIVE, LIVE},
            {LIVE, LIVE, LIVE},
            {LIVE, LIVE, LIVE},};
        p.fillBoard(board);
        assertTrue(Arrays.equals(p.getNeighboursByCell(LENGTH, 1), neighbours));
    }

    @Test
    public void testGetNeighboursByCell_top() {
        Board p = new Board();
        p.setLength(3);

        boolean[] neighbours = {
            DEAD, DEAD, DEAD,
            DEAD, DEAD, DEAD,
            DEAD, DEAD, DEAD};
        boolean[][] board = {
            {DEAD, DEAD, DEAD},
            {DEAD, DEAD, DEAD},
            {DEAD, DEAD, DEAD},};
        p.fillBoard(board);
        assertTrue(Arrays.equals(p.getNeighboursByCell(0, 1), neighbours));

        neighbours = new boolean[]{
            LIVE, DEAD, DEAD,
            DEAD, DEAD, DEAD,
            DEAD, DEAD, DEAD};
        board = new boolean[][]{
            {DEAD, DEAD, DEAD},
            {DEAD, DEAD, DEAD},
            {LIVE, DEAD, DEAD},};
        p.fillBoard(board);
        assertTrue(Arrays.equals(p.getNeighboursByCell(0, 1), neighbours));

        neighbours = new boolean[]{
            LIVE, LIVE, DEAD,
            DEAD, DEAD, DEAD,
            DEAD, DEAD, DEAD};
        board = new boolean[][]{
            {DEAD, DEAD, DEAD},
            {DEAD, DEAD, DEAD},
            {LIVE, LIVE, DEAD},};
        p.fillBoard(board);
        assertTrue(Arrays.equals(p.getNeighboursByCell(0, 1), neighbours));

        neighbours = new boolean[]{
            LIVE, LIVE, LIVE,
            DEAD, DEAD, DEAD,
            DEAD, DEAD, DEAD};
        board = new boolean[][]{
            {DEAD, DEAD, DEAD},
            {DEAD, DEAD, DEAD},
            {LIVE, LIVE, LIVE},};
        p.fillBoard(board);
        assertTrue(Arrays.equals(p.getNeighboursByCell(0, 1), neighbours));

        neighbours = new boolean[]{
            LIVE, LIVE, LIVE,
            LIVE, DEAD, DEAD,
            DEAD, DEAD, DEAD};
        board = new boolean[][]{
            {LIVE, DEAD, DEAD},
            {DEAD, DEAD, DEAD},
            {LIVE, LIVE, LIVE},};
        p.fillBoard(board);
        assertTrue(Arrays.equals(p.getNeighboursByCell(0, 1), neighbours));

        neighbours = new boolean[]{
            LIVE, LIVE, LIVE,
            LIVE, LIVE, DEAD,
            DEAD, DEAD, DEAD};
        board = new boolean[][]{
            {LIVE, LIVE, DEAD},
            {DEAD, DEAD, DEAD},
            {LIVE, LIVE, LIVE},};
        p.fillBoard(board);
        assertTrue(Arrays.equals(p.getNeighboursByCell(0, 1), neighbours));

        neighbours = new boolean[]{
            LIVE, LIVE, LIVE,
            LIVE, LIVE, LIVE,
            DEAD, DEAD, DEAD};
        board = new boolean[][]{
            {LIVE, LIVE, LIVE},
            {DEAD, DEAD, DEAD},
            {LIVE, LIVE, LIVE},};
        p.fillBoard(board);
        assertTrue(Arrays.equals(p.getNeighboursByCell(0, 1), neighbours));

        neighbours = new boolean[]{
            LIVE, LIVE, LIVE,
            LIVE, LIVE, LIVE,
            LIVE, DEAD, DEAD};
        board = new boolean[][]{
            {LIVE, LIVE, LIVE},
            {LIVE, DEAD, DEAD},
            {LIVE, LIVE, LIVE},};
        p.fillBoard(board);
        assertTrue(Arrays.equals(p.getNeighboursByCell(0, 1), neighbours));

        neighbours = new boolean[]{
            LIVE, LIVE, LIVE,
            LIVE, LIVE, LIVE,
            LIVE, LIVE, LIVE};
        board = new boolean[][]{
            {LIVE, LIVE, LIVE},
            {LIVE, LIVE, LIVE},
            {LIVE, LIVE, LIVE},};
        p.fillBoard(board);
        assertTrue(Arrays.equals(p.getNeighboursByCell(0, 1), neighbours));
    }

    private boolean bidimensionalArrayEquals(boolean[][] src, boolean[][] org) {
        int length = src.length;
        for (int i = 0; i != length; i++) {
            boolean isNotEquals = !Arrays.equals(src[i], org[i]);
            if (isNotEquals) {
                return false;
            }
        }
        return true;
    }

    @Test
    public void testTextExolution_1() {
        Board p = new Board();
        boolean[][] board = {
            {DEAD, DEAD, DEAD},
            {DEAD, DEAD, DEAD},
            {DEAD, DEAD, DEAD},};

        boolean[][] nextboard = {
            {DEAD, DEAD, DEAD},
            {DEAD, DEAD, DEAD},
            {DEAD, DEAD, DEAD}};

        p.setLength(3);
        p.fillBoard(board);

        p.nextExolution();
        boolean[][] a = nextboard;
        boolean[][] b = p.getActualBoard();
        assertTrue(bidimensionalArrayEquals(b, a));
    }

    @Test
    public void testTextExolution_2() {
        Board p = new Board();
        boolean[][] board = {
            {LIVE, DEAD, DEAD},
            {DEAD, DEAD, DEAD},
            {DEAD, DEAD, DEAD},};

        boolean[][] nextboard = {
            {DEAD, DEAD, DEAD},
            {DEAD, DEAD, DEAD},
            {DEAD, DEAD, DEAD}};

        p.setLength(3);
        p.fillBoard(board);

        p.nextExolution();
        boolean[][] a = nextboard;
        boolean[][] b = p.getActualBoard();
        assertTrue(bidimensionalArrayEquals(b, a));
    }

    @Test
    public void testTextExolution_3() {
        Board p = new Board();
        boolean[][] board = {
            {LIVE, DEAD, DEAD},
            {DEAD, DEAD, DEAD},
            {DEAD, DEAD, DEAD},};

        boolean[][] nextboard = {
            {DEAD, DEAD, DEAD},
            {DEAD, DEAD, DEAD},
            {DEAD, DEAD, DEAD}};

        p.setLength(3);
        p.fillBoard(board);

        p.nextExolution();
        boolean[][] a = nextboard;
        boolean[][] b = p.getActualBoard();
        assertTrue(bidimensionalArrayEquals(b, a));
    }

    @Test
    public void testTextExolution_4() {
        Board p = new Board();
        boolean[][] board = {
            {LIVE, LIVE, DEAD},
            {DEAD, DEAD, DEAD},
            {DEAD, DEAD, DEAD},};

        boolean[][] nextboard = {
            {DEAD, DEAD, DEAD},
            {DEAD, DEAD, DEAD},
            {DEAD, DEAD, DEAD}};

        p.setLength(3);
        p.fillBoard(board);

        p.nextExolution();
        boolean[][] a = nextboard;
        boolean[][] b = p.getActualBoard();
        assertTrue(bidimensionalArrayEquals(b, a));
    }

    @Test
    public void testTextExolution_5() {
        Board p = new Board();
        boolean[][] board = {
            {LIVE, LIVE, LIVE},
            {DEAD, DEAD, DEAD},
            {DEAD, DEAD, DEAD},};

        boolean[][] nextboard = {
            {LIVE, LIVE, LIVE},
            {LIVE, LIVE, LIVE},
            {LIVE, LIVE, LIVE}};

        p.setLength(3);
        p.fillBoard(board);

        p.nextExolution();
        boolean[][] a = nextboard;
        boolean[][] b = p.getActualBoard();
        assertTrue(bidimensionalArrayEquals(b, a));
    }

    @Test
    public void testTextExolution_6() {
        Board p = new Board();
        boolean[][] board = {
            {LIVE, DEAD, DEAD, DEAD, DEAD, DEAD},
            {DEAD, DEAD, DEAD, DEAD, DEAD, DEAD},
            {DEAD, DEAD, DEAD, DEAD, DEAD, DEAD},
            {DEAD, DEAD, DEAD, DEAD, DEAD, DEAD},
            {DEAD, DEAD, DEAD, DEAD, DEAD, DEAD},
            {DEAD, DEAD, DEAD, DEAD, DEAD, DEAD}};

        boolean[][] nextboard = {
            {DEAD, DEAD, DEAD, DEAD, DEAD, DEAD},
            {DEAD, DEAD, DEAD, DEAD, DEAD, DEAD},
            {DEAD, DEAD, DEAD, DEAD, DEAD, DEAD},
            {DEAD, DEAD, DEAD, DEAD, DEAD, DEAD},
            {DEAD, DEAD, DEAD, DEAD, DEAD, DEAD},
            {DEAD, DEAD, DEAD, DEAD, DEAD, DEAD}};

        p.setLength(6);
        p.fillBoard(board);

        p.nextExolution();
        boolean[][] a = nextboard;
        boolean[][] b = p.getActualBoard();
        assertTrue(bidimensionalArrayEquals(b, a));
    }

    @Test
    public void testTextExolution_7() {
        Board p = new Board();
        boolean[][] board = {
            {LIVE, LIVE, DEAD, DEAD, DEAD, DEAD},
            {DEAD, DEAD, DEAD, DEAD, DEAD, DEAD},
            {DEAD, DEAD, DEAD, DEAD, DEAD, DEAD},
            {DEAD, DEAD, DEAD, DEAD, DEAD, DEAD},
            {DEAD, DEAD, DEAD, DEAD, DEAD, DEAD},
            {DEAD, DEAD, DEAD, DEAD, DEAD, DEAD}};

        boolean[][] nextboard = {
            {DEAD, DEAD, DEAD, DEAD, DEAD, DEAD},
            {DEAD, DEAD, DEAD, DEAD, DEAD, DEAD},
            {DEAD, DEAD, DEAD, DEAD, DEAD, DEAD},
            {DEAD, DEAD, DEAD, DEAD, DEAD, DEAD},
            {DEAD, DEAD, DEAD, DEAD, DEAD, DEAD},
            {DEAD, DEAD, DEAD, DEAD, DEAD, DEAD}};

        p.setLength(6);
        p.fillBoard(board);

        p.nextExolution();
        boolean[][] a = nextboard;
        boolean[][] b = p.getActualBoard();
        assertTrue(bidimensionalArrayEquals(b, a));
    }

    @Test
    public void testTextExolution_8() {
        Board p = new Board();
        boolean[][] board = {
            {LIVE, LIVE, LIVE, DEAD, DEAD, DEAD},
            {DEAD, DEAD, DEAD, DEAD, DEAD, DEAD},
            {DEAD, DEAD, DEAD, DEAD, DEAD, DEAD},
            {DEAD, DEAD, DEAD, DEAD, DEAD, DEAD},
            {DEAD, DEAD, DEAD, DEAD, DEAD, DEAD},
            {DEAD, DEAD, DEAD, DEAD, DEAD, DEAD}};

        boolean[][] nextboard = {
            {DEAD, LIVE, DEAD, DEAD, DEAD, DEAD},
            {DEAD, LIVE, DEAD, DEAD, DEAD, DEAD},
            {DEAD, DEAD, DEAD, DEAD, DEAD, DEAD},
            {DEAD, DEAD, DEAD, DEAD, DEAD, DEAD},
            {DEAD, DEAD, DEAD, DEAD, DEAD, DEAD},
            {DEAD, LIVE, DEAD, DEAD, DEAD, DEAD}};

        p.setLength(6);
        p.fillBoard(board);

        p.nextExolution();
        boolean[][] a = nextboard;
        boolean[][] b = p.getActualBoard();
        assertTrue(bidimensionalArrayEquals(b, a));
    }

    @Test
    public void testTextExolution_9() {
        Board p = new Board();
        boolean[][] board = {
            {DEAD, DEAD, DEAD, DEAD, LIVE, DEAD},
            {DEAD, DEAD, LIVE, DEAD, DEAD, DEAD},
            {DEAD, LIVE, DEAD, DEAD, LIVE, DEAD},
            {DEAD, LIVE, DEAD, DEAD, LIVE, DEAD},
            {DEAD, DEAD, LIVE, DEAD, DEAD, DEAD},
            {DEAD, DEAD, DEAD, DEAD, LIVE, DEAD}};

        boolean[][] nextboard = {
            {DEAD, DEAD, DEAD, LIVE, DEAD, DEAD},
            {DEAD, DEAD, DEAD, LIVE, DEAD, DEAD},
            {DEAD, LIVE, LIVE, LIVE, DEAD, DEAD},
            {DEAD, LIVE, LIVE, LIVE, DEAD, DEAD},
            {DEAD, DEAD, DEAD, LIVE, DEAD, DEAD},
            {DEAD, DEAD, DEAD, LIVE, DEAD, DEAD}};

        p.setLength(6);
        p.fillBoard(board);

        p.nextExolution();
        boolean[][] a = nextboard;
        boolean[][] b = p.getActualBoard();
        assertTrue(bidimensionalArrayEquals(b, a));
    }

    @Test
    public void testTextExolution_10() {
        Board p = new Board();
        boolean[][] board = {
            {DEAD, DEAD, DEAD, LIVE, DEAD, DEAD},
            {DEAD, DEAD, DEAD, LIVE, DEAD, DEAD},
            {DEAD, LIVE, LIVE, LIVE, DEAD, DEAD},
            {DEAD, LIVE, LIVE, LIVE, DEAD, DEAD},
            {DEAD, DEAD, DEAD, LIVE, DEAD, DEAD},
            {DEAD, DEAD, DEAD, LIVE, DEAD, DEAD}};

        boolean[][] nextboard = {
            {DEAD, DEAD, LIVE, LIVE, LIVE, DEAD},
            {DEAD, DEAD, DEAD, LIVE, LIVE, DEAD},
            {DEAD, LIVE, DEAD, DEAD, LIVE, DEAD},
            {DEAD, LIVE, DEAD, DEAD, LIVE, DEAD},
            {DEAD, DEAD, DEAD, LIVE, LIVE, DEAD},
            {DEAD, DEAD, LIVE, LIVE, LIVE, DEAD}};

        p.setLength(6);
        p.fillBoard(board);

        p.nextExolution();
        boolean[][] a = nextboard;
        boolean[][] b = p.getActualBoard();
        assertTrue(bidimensionalArrayEquals(b, a));
    }

    @Test
    public void testTextExolution_11() {
        Board p = new Board();
        boolean[][] board = {
            {DEAD, DEAD, LIVE, LIVE, LIVE, DEAD},
            {DEAD, DEAD, DEAD, LIVE, LIVE, DEAD},
            {DEAD, LIVE, DEAD, DEAD, LIVE, DEAD},
            {DEAD, LIVE, DEAD, DEAD, LIVE, DEAD},
            {DEAD, DEAD, DEAD, LIVE, LIVE, DEAD},
            {DEAD, DEAD, LIVE, LIVE, LIVE, DEAD}};

        boolean[][] nextboard = {
            {DEAD, DEAD, DEAD, DEAD, DEAD, LIVE},
            {DEAD, DEAD, DEAD, DEAD, DEAD, LIVE},
            {DEAD, DEAD, LIVE, DEAD, LIVE, LIVE},
            {DEAD, DEAD, LIVE, DEAD, LIVE, LIVE},
            {DEAD, DEAD, DEAD, DEAD, DEAD, LIVE},
            {DEAD, DEAD, DEAD, DEAD, DEAD, LIVE}};

        p.setLength(6);
        p.fillBoard(board);

        p.nextExolution();
        boolean[][] a = nextboard;
        boolean[][] b = p.getActualBoard();
        assertTrue(bidimensionalArrayEquals(b, a));
    }

    @Test
    public void testTextExolution_12() {
        Board p = new Board();
        boolean[][] board = {
            {DEAD, DEAD, DEAD, DEAD, DEAD, LIVE},
            {DEAD, DEAD, DEAD, DEAD, DEAD, LIVE},
            {DEAD, DEAD, LIVE, DEAD, LIVE, LIVE},
            {DEAD, DEAD, LIVE, DEAD, LIVE, LIVE},
            {DEAD, DEAD, DEAD, DEAD, DEAD, LIVE},
            {DEAD, DEAD, DEAD, DEAD, DEAD, LIVE}};

        boolean[][] nextboard = {
            {LIVE, DEAD, DEAD, DEAD, LIVE, LIVE},
            {LIVE, DEAD, DEAD, DEAD, DEAD, LIVE},
            {LIVE, DEAD, DEAD, DEAD, DEAD, DEAD},
            {LIVE, DEAD, DEAD, DEAD, DEAD, DEAD},
            {LIVE, DEAD, DEAD, DEAD, DEAD, LIVE},
            {LIVE, DEAD, DEAD, DEAD, LIVE, LIVE}};

        p.setLength(6);
        p.fillBoard(board);

        p.nextExolution();
        boolean[][] a = nextboard;
        boolean[][] b = p.getActualBoard();
        assertTrue(bidimensionalArrayEquals(b, a));
    }

    @Test
    public void testTextExolution_13() {
        Board p = new Board();
        boolean[][] board = {
            {LIVE, DEAD, DEAD, DEAD, LIVE, LIVE},
            {LIVE, DEAD, DEAD, DEAD, DEAD, LIVE},
            {LIVE, DEAD, DEAD, DEAD, DEAD, DEAD},
            {LIVE, DEAD, DEAD, DEAD, DEAD, DEAD},
            {LIVE, DEAD, DEAD, DEAD, DEAD, LIVE},
            {LIVE, DEAD, DEAD, DEAD, LIVE, LIVE}};

        boolean[][] nextboard = {
            {DEAD, LIVE, DEAD, DEAD, DEAD, DEAD},
            {DEAD, LIVE, DEAD, DEAD, LIVE, DEAD},
            {LIVE, LIVE, DEAD, DEAD, DEAD, DEAD},
            {LIVE, LIVE, DEAD, DEAD, DEAD, DEAD},
            {DEAD, LIVE, DEAD, DEAD, LIVE, DEAD},
            {DEAD, LIVE, DEAD, DEAD, DEAD, DEAD}};

        p.setLength(6);
        p.fillBoard(board);

        p.nextExolution();
        boolean[][] a = nextboard;
        boolean[][] b = p.getActualBoard();
        assertTrue(bidimensionalArrayEquals(b, a));
    }

    @Test
    public void testTextExolution_14() {
        Board p = new Board();
        boolean[][] board = {
            {DEAD, LIVE, DEAD, DEAD, DEAD, DEAD},
            {DEAD, LIVE, DEAD, DEAD, LIVE, DEAD},
            {LIVE, LIVE, DEAD, DEAD, DEAD, DEAD},
            {LIVE, LIVE, DEAD, DEAD, DEAD, DEAD},
            {DEAD, LIVE, DEAD, DEAD, LIVE, DEAD},
            {DEAD, LIVE, DEAD, DEAD, DEAD, DEAD}};

        boolean[][] nextboard = {
            {LIVE, LIVE, LIVE, DEAD, DEAD, DEAD},
            {DEAD, LIVE, LIVE, DEAD, DEAD, DEAD},
            {DEAD, DEAD, LIVE, DEAD, DEAD, LIVE},
            {DEAD, DEAD, LIVE, DEAD, DEAD, LIVE},
            {DEAD, LIVE, LIVE, DEAD, DEAD, DEAD},
            {LIVE, LIVE, LIVE, DEAD, DEAD, DEAD}};

        p.setLength(6);
        p.fillBoard(board);

        p.nextExolution();
        boolean[][] a = nextboard;
        boolean[][] b = p.getActualBoard();
        assertTrue(bidimensionalArrayEquals(b, a));
    }
}
