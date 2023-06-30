package by.ivasiuk.leetcode

import kotlin.test.Test
import kotlin.test.assertEquals

class LastDayWhereYouCanStillCrossTest {
  private val solution = LastDayWhereYouCanStillCross()

  @Test
  fun example1() {
    assertEquals(
      expected = 2,
      actual = solution.latestDayToCross(
        row = 2,
        col = 2,
        cells = arrayOf(
          intArrayOf(1, 1),
          intArrayOf(2, 1),
          intArrayOf(1, 2),
          intArrayOf(2, 2),
        )
      )
    )
  }

  @Test
  fun example2() {
    assertEquals(
      expected = 1,
      actual = solution.latestDayToCross(
        row = 2,
        col = 2,
        cells = arrayOf(
          intArrayOf(1, 1),
          intArrayOf(1, 2),
          intArrayOf(2, 1),
          intArrayOf(2, 2),
        )
      )
    )
  }

  @Test
  fun example3() {
    assertEquals(
      expected = 3,
      actual = solution.latestDayToCross(
        row = 3,
        col = 3,
        cells = arrayOf(
          intArrayOf(1, 2),
          intArrayOf(2, 1),
          intArrayOf(3, 3),
          intArrayOf(2, 2),
          intArrayOf(1, 1),
          intArrayOf(1, 3),
          intArrayOf(2, 3),
          intArrayOf(3, 2),
          intArrayOf(3, 1),
        )
      )
    )
  }
}
