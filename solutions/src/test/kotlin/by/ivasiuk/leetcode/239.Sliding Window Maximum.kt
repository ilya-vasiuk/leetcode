package by.ivasiuk.leetcode

import kotlin.test.Test
import kotlin.test.assertContentEquals

class SlidingWindowMaximumTest {
  private val solution = SlidingWindowMaximum()

  @Test
  fun example1() {
    assertContentEquals(
      expected = intArrayOf(3, 3, 5, 5, 6, 7),
      actual = solution.maxSlidingWindow(
        nums = intArrayOf(1, 3, -1, -3, 5, 3, 6, 7),
        k = 3,
      )
    )
  }

  @Test
  fun example2() {
    assertContentEquals(
      expected = intArrayOf(1),
      actual = solution.maxSlidingWindow(
        nums = intArrayOf(1),
        k = 1,
      )
    )
  }
}
