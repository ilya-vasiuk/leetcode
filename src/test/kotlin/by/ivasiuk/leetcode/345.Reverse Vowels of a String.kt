package by.ivasiuk.leetcode

import kotlin.test.Test
import kotlin.test.assertEquals

class ReverseVowelsOfAStringTest {
  private val solution = ReverseVowelsOfAString()

  @Test
  fun example1() {
    assertEquals(
      expected = "holle",
      actual = solution.reverseVowels("hello")
    )
  }

  @Test
  fun example2() {
    assertEquals(
      expected = "leotcede",
      actual = solution.reverseVowels("leetcode")
    )
  }
}