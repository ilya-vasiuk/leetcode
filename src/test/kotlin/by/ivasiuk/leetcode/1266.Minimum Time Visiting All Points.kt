package by.ivasiuk.leetcode

import kotlin.test.Test
import kotlin.test.assertEquals

class MinimumTimeVisitingAllPointsTest {
  private val solution = MinimumTimeVisitingAllPoints()

  @Test
  fun example1() {
    assertEquals(
      expected = 7,
      actual = solution.minTimeToVisitAllPoints(
        points = arrayOf(
          intArrayOf(1, 1),
          intArrayOf(3, 4),
          intArrayOf(-1, 0),
        )
      )
    )
  }

  @Test
  fun example2() {
    assertEquals(
      expected = 5,
      actual = solution.minTimeToVisitAllPoints(
        points = arrayOf(
          intArrayOf(3, 2),
          intArrayOf(-2, 2),
        )
      )
    )
  }
}
