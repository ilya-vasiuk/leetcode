package by.ivasiuk.leetcode

import kotlin.test.Test
import kotlin.test.assertContentEquals

class KRadiusSubarrayAveragesTest {
  private val solution = KRadiusSubarrayAverages()

  @Test
  fun example1() {
    assertContentEquals(
      expected = intArrayOf(-1, -1, -1, 5, 4, 4, -1, -1, -1),
      actual = solution.getAverages(
        nums = intArrayOf(7, 4, 3, 9, 1, 8, 5, 2, 6),
        k = 3,
      )
    )
  }

  @Test
  fun example2() {
    assertContentEquals(
      expected = intArrayOf(100000),
      actual = solution.getAverages(
        nums = intArrayOf(100000),
        k = 0,
      )
    )
  }

  @Test
  fun example3() {
    assertContentEquals(
      expected = intArrayOf(-1),
      actual = solution.getAverages(
        nums = intArrayOf(8),
        k = 100000,
      )
    )
  }
}
