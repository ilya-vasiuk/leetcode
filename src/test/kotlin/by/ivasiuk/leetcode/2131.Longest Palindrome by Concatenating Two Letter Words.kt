package by.ivasiuk.leetcode

import kotlin.test.Test
import kotlin.test.assertEquals

class LongestPalindromeByConcatenatingTwoLetterWordsTest {
  private val solution = LongestPalindromeByConcatenatingTwoLetterWords()

  @Test
  fun example1() {
    val result = solution.longestPalindrome(arrayOf("lc", "cl", "gg"))

    assertEquals(6, result)
  }

  @Test
  fun example2() {
    val result = solution.longestPalindrome(arrayOf("ab", "ty", "yt", "lc", "cl", "ab"))

    assertEquals(8, result)
  }

  @Test
  fun example3() {
    val result = solution.longestPalindrome(arrayOf("cc", "ll", "xx"))

    assertEquals(2, result)
  }
}