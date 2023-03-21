package by.ivasiuk.leetcode

import kotlin.test.Test
import kotlin.test.assertEquals

class NumberOfZeroFilledSubarraysTest {
  private val solution = NumberOfZeroFilledSubarrays()

  @Test
  fun example1() {
    assertEquals(
      expected = 6,
      actual = solution.zeroFilledSubarray(
        nums = intArrayOf(1, 3, 0, 0, 2, 0, 0, 4),
      )
    )
  }

  @Test
  fun example2() {
    assertEquals(
      expected = 9,
      actual = solution.zeroFilledSubarray(
        nums = intArrayOf(0, 0, 0, 2, 0, 0),
      )
    )
  }

  @Test
  fun example3() {
    assertEquals(
      expected = 0,
      actual = solution.zeroFilledSubarray(
        nums = intArrayOf(2, 10, 2019),
      )
    )
  }
}
