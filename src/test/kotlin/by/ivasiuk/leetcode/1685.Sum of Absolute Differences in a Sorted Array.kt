package by.ivasiuk.leetcode

import kotlin.test.Test
import kotlin.test.assertContentEquals

class SumOfAbsoluteDifferencesInASortedArrayTest {
  private val solution = SumOfAbsoluteDifferencesInASortedArray()

  @Test
  fun example1() {
    assertContentEquals(
      expected = intArrayOf(4, 3, 5),
      actual = solution.getSumAbsoluteDifferences(
        nums = intArrayOf(2, 3, 5)
      )
    )
  }

  @Test
  fun example2() {
    assertContentEquals(
      expected = intArrayOf(24, 15, 13, 15, 21),
      actual = solution.getSumAbsoluteDifferences(
        nums = intArrayOf(1, 4, 6, 8, 10)
      )
    )
  }
}
