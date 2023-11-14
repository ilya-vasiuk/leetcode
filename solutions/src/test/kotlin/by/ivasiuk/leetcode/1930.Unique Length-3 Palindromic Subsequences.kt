package by.ivasiuk.leetcode

import kotlin.test.Test
import kotlin.test.assertEquals

class UniqueLength3PalindromicSubsequencesTest {
  private val solution = UniqueLength3PalindromicSubsequences()

  @Test
  fun example1() {
    assertEquals(
      expected = 3,
      actual = solution.countPalindromicSubsequence(
        s = "aabca"
      )
    )
  }

  @Test
  fun example2() {
    assertEquals(
      expected = 0,
      actual = solution.countPalindromicSubsequence(
        s = "adc"
      )
    )
  }

  @Test
  fun example3() {
    assertEquals(
      expected = 4,
      actual = solution.countPalindromicSubsequence(
        s = "bbcbaba"
      )
    )
  }
}
