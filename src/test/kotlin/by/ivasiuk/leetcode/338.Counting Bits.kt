package by.ivasiuk.leetcode

import kotlin.test.Test
import kotlin.test.assertContentEquals

class CountingBitsTest {
  private val solution = CountingBits()

  @Test
  fun example1() {
    assertContentEquals(
      expected = intArrayOf(0, 1, 1),
      actual = solution.countBits(
        n = 2
      ),
    )
  }

  @Test
  fun example2() {
    assertContentEquals(
      expected = intArrayOf(0, 1, 1, 2, 1, 2),
      actual = solution.countBits(
        n = 5
      ),
    )
  }
}
