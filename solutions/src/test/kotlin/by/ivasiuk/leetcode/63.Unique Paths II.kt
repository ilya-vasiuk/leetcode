package by.ivasiuk.leetcode

import kotlin.test.Test
import kotlin.test.assertEquals

class UniquePaths2Test {
  private val solution = UniquePaths2()

  @Test
  fun example1() {
    assertEquals(
      expected = 2,
      actual = solution.uniquePathsWithObstacles(
        obstacleGrid = arrayOf(
          intArrayOf(0, 0, 0),
          intArrayOf(0, 1, 0),
          intArrayOf(0, 0, 0),
        )
      )
    )
  }

  @Test
  fun example2() {
    assertEquals(
      expected = 1,
      actual = solution.uniquePathsWithObstacles(
        obstacleGrid = arrayOf(
          intArrayOf(0, 1),
          intArrayOf(0, 0),
        )
      )
    )
  }
}
