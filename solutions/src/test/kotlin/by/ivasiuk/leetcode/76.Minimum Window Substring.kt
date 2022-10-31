package by.ivasiuk.leetcode

import kotlin.test.Test
import kotlin.test.assertEquals

class MinimumWindowSubstringTest {
  private val solution = MinimumWindowSubstring()

  @Test
  fun example1() {
    assertEquals(
      expected = "BANC",
      actual = solution.minWindow(
        s = "ADOBECODEBANC",
        t = "ABC",
      )
    )
  }

  @Test
  fun example2() {
    assertEquals(
      expected = "a",
      actual = solution.minWindow(
        s = "a",
        t = "a",
      )
    )
  }

  @Test
  fun example3() {
    assertEquals(
      expected = "",
      actual = solution.minWindow(
        s = "a",
        t = "aa",
      )
    )
  }
}