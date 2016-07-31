package com.kn.tip.problem;

import org.junit.Test;

import com.kn.tip.problem.AlgorithmicCrush;

import static org.junit.Assert.assertEquals;

public class AlgorithmicCrushTest {
    @Test
    public void test() {
        assertEquals(200L, AlgorithmicCrush.compute(5, new AlgorithmicCrush.Operation[]{
                new AlgorithmicCrush.Operation(1, 2, 100),
                new AlgorithmicCrush.Operation(2, 5, 100),
                new AlgorithmicCrush.Operation(3, 4, 100)
        }));
    }
}
