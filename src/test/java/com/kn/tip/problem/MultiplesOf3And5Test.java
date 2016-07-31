package com.kn.tip.problem;

import org.junit.Test;

import com.kn.tip.problem.MultiplesOf3And5;

import static org.junit.Assert.assertEquals;

public class MultiplesOf3And5Test {

  @Test
  public void test() {
    assertEquals(23L, MultiplesOf3And5.sum(10L));
    assertEquals(2318L, MultiplesOf3And5.sum(100L));
  }
}
