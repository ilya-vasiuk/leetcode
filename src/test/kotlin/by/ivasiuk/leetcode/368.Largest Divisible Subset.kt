package by.ivasiuk.leetcode

import kotlin.test.Test
import kotlin.test.assertContentEquals

class LargestDivisibleSubsetTest {
  private val solution = LargestDivisibleSubset()

  @Test
  fun example1() {
    assertContentEquals(
      expected = listOf(1, 2),
      actual = solution.largestDivisibleSubset(
        nums = intArrayOf(1, 2, 3)
      )
    )
  }

  @Test
  fun example2() {
    assertContentEquals(
      expected = listOf(1, 2, 4, 8),
      actual = solution.largestDivisibleSubset(
        nums = intArrayOf(1, 2, 4, 8)
      )
    )
  }
}
