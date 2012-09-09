/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package game;

import java.util.Arrays;
import org.junit.*;
import static org.junit.Assert.*;

/**
 * X
 * 8 6
 * Y2 0 1 2 3 4 5 6 7 8
 *
 * @author rsa
 */
public class PlayTest {

    private static final boolean LIVE = true;
    private static final boolean DEAD = false;
    private static final int LENGTH = 3 - 1;

    public PlayTest() {
    }

    @Test
    public void testGetNeighboursByCell_min_min() {
        Play p = new Play();
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
        Play p = new Play();
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
        Play p = new Play();
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
        Play p = new Play();
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
        Play p = new Play();
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
        Play p = new Play();
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
        Play p = new Play();
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
        Play p = new Play();
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

    @Test
    public void testTextExolution() {
        Play p = new Play();
        p.setLength(6);
        boolean[][] board = {
            {LIVE, DEAD, DEAD, DEAD, DEAD, LIVE},
            {DEAD, DEAD, DEAD, DEAD, DEAD, DEAD},
            {DEAD, DEAD, DEAD, LIVE, DEAD, DEAD},
            {DEAD, DEAD, DEAD, DEAD, DEAD, LIVE},
            {DEAD, DEAD, DEAD, DEAD, DEAD, DEAD},
            {LIVE, DEAD, DEAD, DEAD, DEAD, LIVE}};

        p.fillBoard(board);
        p.nextExolution();
        p.nextExolution();
        p.nextExolution();
         int n = 100;
        while((--n) != 0){
            p.nextExolution();
        }
    }
}
