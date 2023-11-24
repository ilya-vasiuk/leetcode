package by.ivasiuk.leetcode

import kotlin.test.Test
import kotlin.test.assertContentEquals

class ArithmeticSubarraysTest {
  private val solution = ArithmeticSubarrays()

  @Test
  fun example1() {
    assertContentEquals(
      expected = listOf(true, false, true),
      actual = solution.checkArithmeticSubarrays(
        nums = intArrayOf(4, 6, 5, 9, 3, 7),
        l = intArrayOf(0, 0, 2),
        r = intArrayOf(2, 3, 5)
      )
    )
  }

  @Test
  fun example2() {
    assertContentEquals(
      expected = listOf(false, true, false, false, true, true),
      actual = solution.checkArithmeticSubarrays(
        nums = intArrayOf(-12, -9, -3, -12, -6, 15, 20, -25, -20, -15, -10),
        l = intArrayOf(0, 1, 6, 4, 8, 7),
        r = intArrayOf(4, 4, 9, 7, 9, 10)
      )
    )
  }
}
