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
        Play p = new Play();
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
        Play p = new Play();
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
        Play p = new Play();
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
        Play p = new Play();
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
        Play p = new Play();
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
        Play p = new Play();
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
        Play p = new Play();
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
        Play p = new Play();
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
        Play p = new Play();
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
        Play p = new Play();
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
        Play p = new Play();
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
        Play p = new Play();
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
        Play p = new Play();
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
        Play p = new Play();
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
