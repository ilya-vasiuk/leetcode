package by.ivasiuk.leetcode

import kotlin.test.Test
import kotlin.test.assertEquals

class CapacityToShipPackagesWithinDDaysTest {
  private val solution = CapacityToShipPackagesWithinDDays()

  @Test
  fun example1() {
    assertEquals(
      expected = 15,
      actual = solution.shipWithinDays(
        weights = intArrayOf(1, 2, 3, 4, 5, 6, 7, 8, 9, 10),
        days = 5,
      )
    )
  }

  @Test
  fun example2() {
    assertEquals(
      expected = 6,
      actual = solution.shipWithinDays(
        weights = intArrayOf(3, 2, 2, 4, 1, 4),
        days = 3,
      )
    )
  }

  @Test
  fun example3() {
    assertEquals(
      expected = 3,
      actual = solution.shipWithinDays(
        weights = intArrayOf(1, 2, 3, 1, 1),
        days = 4,
      )
    )
  }
}
