package by.ivasiuk.leetcode

import kotlin.test.Test
import kotlin.test.assertEquals

class MinimumNumberOfArrowsToBurstBalloonsTest {
  private val solution = MinimumNumberOfArrowsToBurstBalloons()

  @Test
  fun example1() {
    assertEquals(
      expected = 2,
      actual = solution.findMinArrowShots(
        points = arrayOf(
          intArrayOf(10, 16),
          intArrayOf(2, 8),
          intArrayOf(1, 6),
          intArrayOf(7, 12),
        )
      )
    )
  }

  @Test
  fun example2() {
    assertEquals(
      expected = 4,
      actual = solution.findMinArrowShots(
        points = arrayOf(
          intArrayOf(1, 2),
          intArrayOf(3, 4),
          intArrayOf(5, 6),
          intArrayOf(7, 8),
        )
      )
    )
  }

  @Test
  fun example3() {
    assertEquals(
      expected = 2,
      actual = solution.findMinArrowShots(
        points = arrayOf(
          intArrayOf(1, 2),
          intArrayOf(2, 3),
          intArrayOf(3, 4),
          intArrayOf(4, 5),
        )
      )
    )
  }
}
