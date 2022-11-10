package by.ivasiuk.leetcode

import kotlin.test.Test
import kotlin.test.assertEquals

class MaxPointsOnALineTest {
  private val solution = MaxPointsOnALine()

  @Test
  fun example1() {
    assertEquals(
      expected = 3,
      actual = solution.maxPoints(
        points = arrayOf(
          intArrayOf(1, 1),
          intArrayOf(2, 2),
          intArrayOf(3, 3),
        )
      )
    )
  }

  @Test
  fun example2() {
    assertEquals(
      expected = 4,
      actual = solution.maxPoints(
        points = arrayOf(
          intArrayOf(1, 1),
          intArrayOf(3, 2),
          intArrayOf(5, 3),
          intArrayOf(4, 1),
          intArrayOf(2, 3),
          intArrayOf(1, 4),
        )
      )
    )
  }
}
