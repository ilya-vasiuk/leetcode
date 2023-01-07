package by.ivasiuk.leetcode

import kotlin.test.Test
import kotlin.test.assertEquals

class GasStationTest {
  private val solution = GasStation()

  @Test
  fun example1() {
    assertEquals(
      expected = 3,
      actual = solution.canCompleteCircuit(
        gas = intArrayOf(1, 2, 3, 4, 5),
        cost = intArrayOf(3, 4, 5, 1, 2),
      )
    )
  }

  @Test
  fun example2() {
    assertEquals(
      expected = -1,
      actual = solution.canCompleteCircuit(
        gas = intArrayOf(2, 3, 4),
        cost = intArrayOf(3, 4, 3),
      )
    )
  }
}
