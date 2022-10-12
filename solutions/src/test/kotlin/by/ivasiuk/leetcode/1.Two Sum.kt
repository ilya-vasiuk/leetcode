package by.ivasiuk.leetcode

import kotlin.test.Test
import kotlin.test.assertContentEquals

class TwoSumTest {
  private val solution = TwoSum()

  @Test
  fun example1() {
    val result = solution.twoSum(
      nums = intArrayOf(2, 7, 11, 15),
      target = 9,
    )
    assertContentEquals(result, intArrayOf(0, 1))
  }

  @Test
  fun example2() {
    val result = solution.twoSum(
      nums = intArrayOf(3, 2, 4),
      target = 6,
    )
    assertContentEquals(result, intArrayOf(1, 2))
  }

  @Test
  fun example3() {
    val result = solution.twoSum(
      nums = intArrayOf(3, 3),
      target = 6,
    )
    assertContentEquals(result, intArrayOf(0, 1))
  }
}
