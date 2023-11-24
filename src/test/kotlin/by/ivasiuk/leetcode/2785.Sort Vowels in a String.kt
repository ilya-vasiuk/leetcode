package by.ivasiuk.leetcode

import kotlin.test.Test
import kotlin.test.assertEquals

class SortVowelsInAStringTest {
  private val solution = SortVowelsInAString()

  @Test
  fun example1() {
    assertEquals(
      expected = "lEOtcede",
      actual = solution.sortVowels(
        s = "lEetcOde"
      )
    )
  }

  @Test
  fun example2() {
    assertEquals(
      expected = "lYmpH",
      actual = solution.sortVowels(
        s = "lYmpH"
      )
    )
  }
}
