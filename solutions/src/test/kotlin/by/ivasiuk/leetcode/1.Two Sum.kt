package by.ivasiuk.leetcode

import kotlin.test.Test
import kotlin.test.assertContentEquals

class TwoSumTest {
  private val solution = TwoSum()

  @Test
  fun example1() {
    assertContentEquals(
      expected = intArrayOf(0, 1),
      actual = solution.twoSum(
        nums = intArrayOf(2, 7, 11, 15),
        target = 9,
      )
    )
  }

  @Test
  fun example2() {
    assertContentEquals(
      expected = intArrayOf(1, 2),
      actual = solution.twoSum(
        nums = intArrayOf(3, 2, 4),
        target = 6,
      )
    )
  }

  @Test
  fun example3() {
    assertContentEquals(
      expected = intArrayOf(0, 1),
      actual = solution.twoSum(
        nums = intArrayOf(3, 3),
        target = 6,
      )
    )
  }
}
