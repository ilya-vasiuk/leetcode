package by.ivasiuk.leetcode

import kotlin.test.Test
import kotlin.test.assertEquals

class SubarraySumsDivisibleByKTest {
  private val solution = SubarraySumsDivisibleByK()

  @Test
  fun example1() {
    assertEquals(
      expected = 7,
      actual = solution.subarraysDivByK(
        nums = intArrayOf(4, 5, 0, -2, -3, 1),
        k = 5,
      )
    )
  }

  @Test
  fun example2() {
    assertEquals(
      expected = 0,
      actual = solution.subarraysDivByK(
        nums = intArrayOf(5),
        k = 9,
      )
    )
  }
}
