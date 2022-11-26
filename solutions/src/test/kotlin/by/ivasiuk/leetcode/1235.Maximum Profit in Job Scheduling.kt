package by.ivasiuk.leetcode

import kotlin.test.Test
import kotlin.test.assertEquals

class MaximumProfitInJobSchedulingTest {
  private val solution = MaximumProfitInJobScheduling()

  @Test
  fun example1() {
    assertEquals(
      expected = 120,
      actual = solution.jobScheduling(
        startTime = intArrayOf(1, 2, 3, 3),
        endTime = intArrayOf(3, 4, 5, 6),
        profit = intArrayOf(50, 10, 40, 70),
      )
    )
  }

  @Test
  fun example2() {
    assertEquals(
      expected = 150,
      actual = solution.jobScheduling(
        startTime = intArrayOf(1, 2, 3, 4, 6),
        endTime = intArrayOf(3, 5, 10, 6, 9),
        profit = intArrayOf(20, 20, 100, 70, 60),
      )
    )
  }

  @Test
  fun example3() {
    assertEquals(
      expected = 6,
      actual = solution.jobScheduling(
        startTime = intArrayOf(1, 1, 1),
        endTime = intArrayOf(2, 3, 4),
        profit = intArrayOf(5, 6, 4),
      )
    )
  }
}