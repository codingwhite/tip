package com.kn.tip.problem;

import org.junit.Test;

import com.kn.tip.problem.GridChallenge;

import static org.junit.Assert.assertTrue;

public class GridChallengeTest {
    @Test
    public void test() {
        final char[][] grid = new char[][] {
            {'e', 'b', 'a', 'c', 'd'},
            {'f', 'g', 'h', 'i', 'j'},
            {'o', 'l', 'm', 'k', 'n'},
            {'t', 'r', 'p', 'q', 's'},
            {'x', 'y', 'w', 'u', 'v'},
            };
        assertTrue(GridChallenge.canBeSort(grid, 5));
    }
}
