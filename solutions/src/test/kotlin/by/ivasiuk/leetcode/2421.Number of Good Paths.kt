package by.ivasiuk.leetcode

import kotlin.test.Test
import kotlin.test.assertEquals

class NumberOfGoodPathsTest {
  private val solution = NumberOfGoodPaths()

  @Test
  fun example1() {
    assertEquals(
      expected = 6,
      actual = solution.numberOfGoodPaths(
        vals = intArrayOf(1, 3, 2, 1, 3),
        edges = arrayOf(
          intArrayOf(0, 1),
          intArrayOf(0, 2),
          intArrayOf(2, 3),
          intArrayOf(2, 4),
        )
      )
    )
  }

  @Test
  fun example2() {
    assertEquals(
      expected = 7,
      actual = solution.numberOfGoodPaths(
        vals = intArrayOf(1, 1, 2, 2, 3),
        edges = arrayOf(
          intArrayOf(0, 1),
          intArrayOf(1, 2),
          intArrayOf(2, 3),
          intArrayOf(2, 4),
        )
      )
    )
  }

  @Test
  fun example3() {
    assertEquals(
      expected = 1,
      actual = solution.numberOfGoodPaths(
        vals = intArrayOf(1),
        edges = arrayOf()
      )
    )
  }
}
