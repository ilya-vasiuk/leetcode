package by.ivasiuk.leetcode

import kotlin.test.Test
import kotlin.test.assertEquals

class NumberOfIncreasingPathsInAGridTest {
  private val solution = NumberOfIncreasingPathsInAGrid()

  @Test
  fun example1() {
    assertEquals(
      expected = 8,
      actual = solution.countPaths(
        grid = arrayOf(
          intArrayOf(1, 1),
          intArrayOf(3, 4),
        )
      )
    )
  }

  @Test
  fun example2() {
    assertEquals(
      expected = 3,
      actual = solution.countPaths(
        grid = arrayOf(
          intArrayOf(1, 2),
        )
      )
    )
  }
}
