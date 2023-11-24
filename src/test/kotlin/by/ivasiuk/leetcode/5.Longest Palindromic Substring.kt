package by.ivasiuk.leetcode

import kotlin.test.Test
import kotlin.test.assertEquals

class LongestPalindromicSubstringTest {
  private val solution = LongestPalindromicSubstring()

  @Test
  fun example1() {
    assertEquals(
      expected = "bab",
      actual = solution.longestPalindrome(
        s = "babad"
      )
    )
  }

  @Test
  fun example2() {
    assertEquals(
      expected = "bb",
      actual = solution.longestPalindrome(
        s = "cbbd"
      )
    )
  }
}
