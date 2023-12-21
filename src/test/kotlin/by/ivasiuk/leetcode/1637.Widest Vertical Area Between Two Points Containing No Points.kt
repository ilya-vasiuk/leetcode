package by.ivasiuk.leetcode

import kotlin.test.Test
import kotlin.test.assertEquals

class WidestVerticalAreaBetweenTwoPointsContainingNoPointsTest {
  private val solution = WidestVerticalAreaBetweenTwoPointsContainingNoPoints()

  @Test
  fun example1() {
    assertEquals(
      expected = 1,
      actual = solution.maxWidthOfVerticalArea(
        points = arrayOf(
          intArrayOf(8, 7),
          intArrayOf(9, 9),
          intArrayOf(7, 4),
          intArrayOf(9, 7),
        )
      )
    )
  }

  @Test
  fun example2() {
    assertEquals(
      expected = 3,
      actual = solution.maxWidthOfVerticalArea(
        points = arrayOf(
          intArrayOf(3, 1),
          intArrayOf(9, 0),
          intArrayOf(1, 0),
          intArrayOf(1, 4),
          intArrayOf(5, 3),
          intArrayOf(8, 8),
        )
      )
    )
  }
}
