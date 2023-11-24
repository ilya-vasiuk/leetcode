package by.ivasiuk.leetcode

import kotlin.test.Test
import kotlin.test.assertEquals

class LongestSubstringWithoutRepeatingCharactersTest {
  private val solution = LongestSubstringWithoutRepeatingCharacters()

  @Test
  fun example1() {
    assertEquals(
      expected = 3,
      actual = solution.lengthOfLongestSubstring(
        s = "abcabcbb"
      ))
  }

  @Test
  fun example2() {
    assertEquals(
      expected = 1,
      actual = solution.lengthOfLongestSubstring(
        s = "bbbbb"
      )
    )
  }

  @Test
  fun example3() {
    assertEquals(
      expected = 3,
      actual = solution.lengthOfLongestSubstring(
        s = "pwwkew"
      )
    )
  }
}