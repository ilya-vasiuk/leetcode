package by.ivasiuk.leetcode

import kotlin.test.Test
import kotlin.test.assertEquals

class FindTheIndexOfTheFirstOccurrenceInAStringTest {
  private val solution = FindTheIndexOfTheFirstOccurrenceInAString()

  @Test
  fun example1() {
    assertEquals(
      expected = 0,
      actual = solution.strStr(
        haystack = "sadbutsad",
        needle = "sad",
      )
    )
  }

  @Test
  fun example2() {
    assertEquals(
      expected = -1,
      actual = solution.strStr(
        haystack = "leetcode",
        needle = "leeto",
      )
    )
  }
}
