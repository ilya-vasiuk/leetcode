package by.ivasiuk.leetcode

import kotlin.test.Test
import kotlin.test.assertEquals

class MaximumRunningTimeOfNComputersTest {
  private val solution = MaximumRunningTimeOfNComputers()

  @Test
  fun example1() {
    assertEquals(
      expected = 4,
      actual = solution.maxRunTime(
        n = 2,
        batteries = intArrayOf(3, 3, 3)
      )
    )
  }

  @Test
  fun example2() {
    assertEquals(
      expected = 2,
      actual = solution.maxRunTime(
        n = 2,
        batteries = intArrayOf(1, 1, 1, 1)
      )
    )
  }
}
