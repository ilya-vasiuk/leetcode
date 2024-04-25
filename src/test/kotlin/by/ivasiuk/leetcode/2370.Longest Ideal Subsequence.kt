package by.ivasiuk.leetcode

import kotlin.test.Test
import kotlin.test.assertEquals

class LongestIdealSubsequenceTest {
  private val solution = LongestIdealSubsequence()

  @Test
  fun example1() {
    assertEquals(
      expected = 4,
      actual = solution.longestIdealString(
        s = "acfgbd",
        k = 2,
      )
    )
  }

  @Test
  fun example2() {
    assertEquals(
      expected = 4,
      actual = solution.longestIdealString(
        s = "abcd",
        k = 3,
      )
    )
  }
}
