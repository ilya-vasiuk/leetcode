package by.ivasiuk.leetcode

import kotlin.test.Test
import kotlin.test.assertEquals

class MinimumPathSumTest {
  private val solution = MinimumPathSum()

  @Test
  fun example1() {
    assertEquals(
      expected = 7,
      actual = solution.minPathSum(
        grid = arrayOf(
          intArrayOf(1,3,1),
          intArrayOf(1,5,1),
          intArrayOf(4,2,1),
        )
      )
    )
  }

  @Test
  fun example2() {
    assertEquals(
      expected = 12,
      actual = solution.minPathSum(
        grid = arrayOf(
          intArrayOf(1,2,3),
          intArrayOf(4,5,6),
        )
      )
    )
  }
}
