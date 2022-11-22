package by.ivasiuk.leetcode

import kotlin.test.Test
import kotlin.test.assertContentEquals

class SortIntegersByTheNumberOf1BitsTest {
  private val solution = SortIntegersByTheNumberOf1Bits()

  @Test
  fun example1() {
    assertContentEquals(
      expected = intArrayOf(0, 1, 2, 4, 8, 3, 5, 6, 7),
      actual = solution.sortByBits(
        arr = intArrayOf(0, 1, 2, 3, 4, 5, 6, 7, 8),
      )
    )
  }

  @Test
  fun example2() {
    assertContentEquals(
      expected = intArrayOf(1, 2, 4, 8, 16, 32, 64, 128, 256, 512, 1024),
      actual = solution.sortByBits(
        arr = intArrayOf(1024, 512, 256, 128, 64, 32, 16, 8, 4, 2, 1),
      )
    )
  }
}
