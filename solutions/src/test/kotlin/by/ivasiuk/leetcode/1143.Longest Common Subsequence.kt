package by.ivasiuk.leetcode

import kotlin.test.Test
import kotlin.test.assertEquals

class LongestCommonSubsequenceTest {
  private val solution = LongestCommonSubsequence()

  @Test
  fun example1() {
    assertEquals(
      expected = 3,
      actual = solution.longestCommonSubsequence(
        text1 = "abcde",
        text2 = "ace",
      )
    )
  }

  @Test
  fun example2() {
    assertEquals(
      expected = 3,
      actual = solution.longestCommonSubsequence(
        text1 = "abc",
        text2 = "abc",
      )
    )
  }

  @Test
  fun example3() {
    assertEquals(
      expected = 0,
      actual = solution.longestCommonSubsequence(
        text1 = "abc",
        text2 = "def",
      )
    )
  }

  @Test
  fun example4() {
    assertEquals(
      expected = 1,
      actual = solution.longestCommonSubsequence(
        text1 = "bsbininm",
        text2 = "jmjkbkjkv",
      )
    )
  }
}
