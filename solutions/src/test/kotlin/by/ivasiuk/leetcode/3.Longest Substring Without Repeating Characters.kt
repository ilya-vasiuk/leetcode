package by.ivasiuk.leetcode

import kotlin.test.Test
import kotlin.test.assertEquals

class LongestSubstringWithoutRepeatingCharactersTest {
  private val solution = LongestSubstringWithoutRepeatingCharacters()

  @Test
  fun example1() {
    val result = solution.lengthOfLongestSubstring("abcabcbb")
    assertEquals(3, result)
  }

  @Test
  fun example2() {
    val result = solution.lengthOfLongestSubstring("bbbbb")
    assertEquals(1, result)
  }

  @Test
  fun example3() {
    val result = solution.lengthOfLongestSubstring("pwwkew")
    assertEquals(3, result)
  }
}