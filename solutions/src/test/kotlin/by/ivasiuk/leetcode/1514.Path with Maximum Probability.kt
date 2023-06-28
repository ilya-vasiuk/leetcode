package by.ivasiuk.leetcode

import kotlin.test.Test
import kotlin.test.assertEquals

class PathWithMaximumProbabilityTest {
  private val solution = PathWithMaximumProbability()

  @Test
  fun example1() {
    assertEquals(
      expected = 0.25000,
      actual = solution.maxProbability(
        n = 3,
        edges = arrayOf(
          intArrayOf(0, 1),
          intArrayOf(1, 2),
          intArrayOf(0, 2),
        ),
        succProb = doubleArrayOf(0.5, 0.5, 0.2),
        start = 0,
        end = 2,
      )
    )
  }

  @Test
  fun example2() {
    assertEquals(
      expected = 0.30000,
      actual = solution.maxProbability(
        n = 3,
        edges = arrayOf(
          intArrayOf(0, 1),
          intArrayOf(1, 2),
          intArrayOf(0, 2),
        ),
        succProb = doubleArrayOf(0.5, 0.5, 0.3),
        start = 0,
        end = 2,
      )
    )
  }

  @Test
  fun example3() {
    assertEquals(
      expected = 0.00000,
      actual = solution.maxProbability(
        n = 3,
        edges = arrayOf(
          intArrayOf(0, 1),
        ),
        succProb = doubleArrayOf(0.5),
        start = 0,
        end = 2,
      )
    )
  }
}
