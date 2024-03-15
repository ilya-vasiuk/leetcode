package by.ivasiuk.leetcode

import kotlin.test.Test
import kotlin.test.assertContentEquals

class ProductOfArrayExceptSelfTest {
  private val solution = ProductOfArrayExceptSelf()

  @Test
  fun example1() {
    assertContentEquals(
      expected = intArrayOf(24, 12, 8, 6),
      actual = solution.productExceptSelf(
        nums = intArrayOf(1, 2, 3, 4),
      )
    )
  }

  @Test
  fun example2() {
    assertContentEquals(
      expected = intArrayOf(0, 0, 9, 0, 0),
      actual = solution.productExceptSelf(
        nums = intArrayOf(-1, 1, 0, -3, 3),
      )
    )
  }
}
