package by.ivasiuk.leetcode

import kotlin.test.Test
import kotlin.test.assertEquals

class GreatestCommonDivisorOfStringsTest {
  private val solution = GreatestCommonDivisorOfStrings()

  @Test
  fun example1() {
    assertEquals(
      expected = "ABC",
      actual = solution.gcdOfStrings(
        str1 = "ABCABC",
        str2 = "ABC"
      )
    )
  }

  @Test
  fun example2() {
    assertEquals(
      expected = "AB",
      actual = solution.gcdOfStrings(
        str1 = "ABABAB",
        str2 = "ABAB"
      )
    )
  }

  @Test
  fun example3() {
    assertEquals(
      expected = "",
      actual = solution.gcdOfStrings(
        str1 = "LEET",
        str2 = "CODE"
      )
    )
  }
}
