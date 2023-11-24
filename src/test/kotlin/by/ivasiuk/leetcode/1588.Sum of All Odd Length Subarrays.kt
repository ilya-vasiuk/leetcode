package by.ivasiuk.leetcode

import kotlin.test.Test
import kotlin.test.assertEquals

class SumOfAllOddLengthSubarraysTest {
  private val solution = SumOfAllOddLengthSubarrays()

  @Test
  fun example1() {
    assertEquals(
      expected = 58,
      actual = solution.sumOddLengthSubarrays(
        arr = intArrayOf(1, 4, 2, 5, 3)
      )
    )
  }

  @Test
  fun example2() {
    assertEquals(
      expected = 3,
      actual = solution.sumOddLengthSubarrays(
        arr = intArrayOf(1, 2)
      )
    )
  }

  @Test
  fun example3() {
    assertEquals(
      expected = 66,
      actual = solution.sumOddLengthSubarrays(
        arr = intArrayOf(10, 11, 12)
      )
    )
  }
}
