package by.ivasiuk.leetcode

import kotlin.test.Test
import kotlin.test.assertEquals

class LargestSubstringBetweenTwoEqualCharactersTest {
  private val solution = LargestSubstringBetweenTwoEqualCharacters()

  @Test
  fun example1() {
    assertEquals(
      expected = 0,
      actual = solution.maxLengthBetweenEqualCharacters(
        s = "aa"
      )
    )
  }

  @Test
  fun example2() {
    assertEquals(
      expected = 2,
      actual = solution.maxLengthBetweenEqualCharacters(
        s = "abca"
      )
    )
  }

  @Test
  fun example3() {
    assertEquals(
      expected = -1,
      actual = solution.maxLengthBetweenEqualCharacters(
        s = "cbzxy"
      )
    )
  }
}
