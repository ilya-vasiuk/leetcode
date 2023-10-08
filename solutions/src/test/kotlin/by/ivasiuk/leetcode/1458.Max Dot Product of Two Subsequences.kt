package by.ivasiuk.leetcode

import kotlin.test.Test
import kotlin.test.assertEquals

class MaxDotProductOfTwoSubsequencesTest {
  private val solution = MaxDotProductOfTwoSubsequences()

  @Test
  fun example1() {
    assertEquals(
      expected = 18,
      actual = solution.maxDotProduct(
        nums1 = intArrayOf(2, 1, -2, 5),
        nums2 = intArrayOf(3, 0, -6)
      )
    )
  }

  @Test
  fun example2() {
    assertEquals(
      expected = 21,
      actual = solution.maxDotProduct(
        nums1 = intArrayOf(3, -2),
        nums2 = intArrayOf(2, -6, 7)
      )
    )
  }

  @Test
  fun example3() {
    assertEquals(
      expected = -1,
      actual = solution.maxDotProduct(
        nums1 = intArrayOf(-1, -1),
        nums2 = intArrayOf(1, 1)
      )
    )
  }
}
