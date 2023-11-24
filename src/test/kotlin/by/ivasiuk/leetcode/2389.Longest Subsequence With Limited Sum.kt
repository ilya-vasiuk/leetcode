package by.ivasiuk.leetcode

import kotlin.test.Test
import kotlin.test.assertContentEquals

class LongestSubsequenceWithLimitedSumTest {
  private val solution = LongestSubsequenceWithLimitedSum()

  @Test
  fun example1() {
    assertContentEquals(
      expected = intArrayOf(2, 3, 4),
      actual = solution.answerQueries(
        nums = intArrayOf(4, 5, 2, 1),
        queries = intArrayOf(3, 10, 21)
      )
    )
  }

  @Test
  fun example2() {
    assertContentEquals(
      expected = intArrayOf(0),
      actual = solution.answerQueries(
        nums = intArrayOf(2, 3, 4, 5),
        queries = intArrayOf(1)
      )
    )
  }
}
