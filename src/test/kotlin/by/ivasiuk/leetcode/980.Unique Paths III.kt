package by.ivasiuk.leetcode

import kotlin.test.Test
import kotlin.test.assertEquals

class UniquePaths3Test {
  private val solution = UniquePaths3()

  @Test
  fun example1() {
    assertEquals(
      expected = 2,
      actual = solution.uniquePathsIII(
        grid = arrayOf(
          intArrayOf(1, 0, 0, 0),
          intArrayOf(0, 0, 0, 0),
          intArrayOf(0, 0, 2, -1),
        )
      )
    )
  }

  @Test
  fun example2() {
    assertEquals(
      expected = 4,
      actual = solution.uniquePathsIII(
        grid = arrayOf(
          intArrayOf(1, 0, 0, 0),
          intArrayOf(0, 0, 0, 0),
          intArrayOf(0, 0, 0, 2),
        )
      )
    )
  }

  @Test
  fun example3() {
    assertEquals(
      expected = 0,
      actual = solution.uniquePathsIII(
        grid = arrayOf(
          intArrayOf(0, 1),
          intArrayOf(2, 0),
        )
      )
    )
  }
}
