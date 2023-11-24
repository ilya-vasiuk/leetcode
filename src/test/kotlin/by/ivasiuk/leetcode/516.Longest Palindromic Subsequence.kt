package by.ivasiuk.leetcode

import kotlin.test.Test
import kotlin.test.assertEquals

class LongestPalindromicSubsequenceTest {
  private val solution = LongestPalindromicSubsequence()

  @Test
  fun example1() {
    assertEquals(
      expected = 4,
      actual = solution.longestPalindromeSubseq(
        s = "bbbab"
      )
    )
  }

  @Test
  fun example2() {
    assertEquals(
      expected = 2,
      actual = solution.longestPalindromeSubseq(
        s = "cbbd"
      )
    )
  }
}
