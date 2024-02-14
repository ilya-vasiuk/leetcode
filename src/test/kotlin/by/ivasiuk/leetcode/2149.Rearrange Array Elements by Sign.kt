package by.ivasiuk.leetcode

import kotlin.test.Test
import kotlin.test.assertContentEquals

class RearrangeArrayElementsBySignTest {
  private val solution = RearrangeArrayElementsBySign()

  @Test
  fun example1() {
    assertContentEquals(
      expected = intArrayOf(3, -2, 1, -5, 2, -4),
      actual = solution.rearrangeArray(
        nums = intArrayOf(3, 1, -2, -5, 2, -4)
      )
    )
  }

  @Test
  fun example2() {
    assertContentEquals(
      expected = intArrayOf(1, -1),
      actual = solution.rearrangeArray(
        nums = intArrayOf(-1, 1)
      )
    )
  }
}
