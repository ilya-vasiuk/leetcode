package by.ivasiuk.leetcode

import kotlin.test.Test
import kotlin.test.assertEquals

class MinimumTimeToCompleteTripsTest {
  private val solution = MinimumTimeToCompleteTrips()

  @Test
  fun example1() {
    assertEquals(
      expected = 3,
      actual = solution.minimumTime(
        time = intArrayOf(1, 2, 3),
        totalTrips = 5,
      )
    )
  }

  @Test
  fun example2() {
    assertEquals(
      expected = 2,
      actual = solution.minimumTime(
        time = intArrayOf(2),
        totalTrips = 1,
      )
    )
  }
}
