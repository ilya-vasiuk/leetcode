package by.ivasiuk.leetcode

import kotlin.test.Test
import kotlin.test.assertEquals

class MinimumOperationsToMakeArrayEqual2Test {
  private val solution = MinimumOperationsToMakeArrayEqual2()

  @Test
  fun example1() {
    assertEquals(
      expected = 2,
      actual = solution.minOperations(
        nums1 = intArrayOf(4, 3, 1, 4),
        nums2 = intArrayOf(1, 3, 7, 1),
        k = 3,
      )
    )
  }

  @Test
  fun example2() {
    assertEquals(
      expected = -1,
      actual = solution.minOperations(
        nums1 = intArrayOf(3, 8, 5, 2),
        nums2 = intArrayOf(2, 4, 1, 6),
        k = 1,
      )
    )
  }

  @Test
  fun example3() {
    assertEquals(
      expected = -1,
      actual = solution.minOperations(
        nums1 = intArrayOf(1,2,2),
        nums2 = intArrayOf(0,0,4),
        k = 2,
      )
    )
  }
}
