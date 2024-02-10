package by.ivasiuk.leetcode

import kotlin.test.Test
import kotlin.test.assertEquals

class PalindromicSubstringsTest {
  private val solution = PalindromicSubstrings()

  @Test
  fun example1() {
    assertEquals(
      expected = 3,
      actual = solution.countSubstrings(
        s = "abc"
      )
    )
  }

  @Test
  fun example2() {
    assertEquals(
      expected = 6,
      actual = solution.countSubstrings(
        s = "aaa"
      )
    )
  }
}
