package by.ivasiuk.leetcode

import kotlin.test.Test
import kotlin.test.assertEquals

class KthLargestElementInAnArrayTest {
  private val solution = KthLargestElementInAnArray()

  @Test
  fun example1() {
    assertEquals(
      expected = 5,
      actual = solution.findKthLargest(
        nums = intArrayOf(3, 2, 1, 5, 6, 4),
        k = 2,
      )
    )
  }

  @Test
  fun example2() {
    assertEquals(
      expected = 4,
      actual = solution.findKthLargest(
        nums = intArrayOf(3,2,3,1,2,4,5,5,6),
        k = 4,
      )
    )
  }
}
