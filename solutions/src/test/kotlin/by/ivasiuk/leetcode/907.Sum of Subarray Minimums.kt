package by.ivasiuk.leetcode

import kotlin.test.Test
import kotlin.test.assertEquals

class SumOfSubarrayMinimumsTest {
  private val solution = SumOfSubarrayMinimums()

  @Test
  fun example1() {
    assertEquals(
      expected = 17,
      actual = solution.sumSubarrayMins(
        arr = intArrayOf(3, 1, 2, 4)
      )
    )
  }

  @Test
  fun example2() {
    assertEquals(
      expected = 444,
      actual = solution.sumSubarrayMins(
        arr = intArrayOf(11, 81, 94, 43, 3)
      )
    )
  }
}
