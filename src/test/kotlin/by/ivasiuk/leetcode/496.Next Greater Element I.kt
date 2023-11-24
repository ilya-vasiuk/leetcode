package by.ivasiuk.leetcode

import kotlin.test.Test
import kotlin.test.assertContentEquals

class NextGreaterElement1Test {
  private val solution = NextGreaterElement1()

  @Test
  fun example1() {
    assertContentEquals(
      expected = intArrayOf(-1, 3, -1),
      actual = solution.nextGreaterElement(
        nums1 = intArrayOf(4, 1, 2),
        nums2 = intArrayOf(1, 3, 4, 2)
      )
    )
  }

  @Test
  fun example2() {
    assertContentEquals(
      expected = intArrayOf(3, -1),
      actual = solution.nextGreaterElement(
        nums1 = intArrayOf(2, 4),
        nums2 = intArrayOf(1, 2, 3, 4)
      )
    )
  }
}