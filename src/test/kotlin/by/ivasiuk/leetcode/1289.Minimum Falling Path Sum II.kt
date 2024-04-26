package by.ivasiuk.leetcode

import kotlin.test.Test
import kotlin.test.assertEquals

class MinimumFallingPathSum2Test {
  private val solution = MinimumFallingPathSum2()

  @Test
  fun example1() {
    assertEquals(
      expected = 13,
      actual = solution.minFallingPathSum(
        grid = arrayOf(
          intArrayOf(1, 2, 3),
          intArrayOf(4, 5, 6),
          intArrayOf(7, 8, 9),
        )
      )
    )
  }

  @Test
  fun example2() {
    assertEquals(
      expected = 7,
      actual = solution.minFallingPathSum(
        grid = arrayOf(
          intArrayOf(7),
        )
      )
    )
  }
}
