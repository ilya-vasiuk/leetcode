package by.ivasiuk.leetcode

import kotlin.test.Test
import kotlin.test.assertEquals

class FindNearestPointThatHasTheSameXOrYCoordinateTest {
  private val solution = FindNearestPointThatHasTheSameXOrYCoordinate()

  @Test
  fun example1() {
    assertEquals(
      expected = 2,
      actual = solution.nearestValidPoint(
        x = 3,
        y = 4,
        points = arrayOf(
          intArrayOf(1, 2),
          intArrayOf(3, 1),
          intArrayOf(2, 4),
          intArrayOf(2, 3),
          intArrayOf(4, 4),
        ),
      )
    )
  }

  @Test
  fun example2() {
    assertEquals(
      expected = 0,
      actual = solution.nearestValidPoint(
        x = 3,
        y = 4,
        points = arrayOf(
          intArrayOf(3, 4),
        ),
      )
    )
  }

  @Test
  fun example3() {
    assertEquals(
      expected = -1,
      actual = solution.nearestValidPoint(
        x = 3,
        y = 4,
        points = arrayOf(
          intArrayOf(2, 3),
        ),
      )
    )
  }
}
