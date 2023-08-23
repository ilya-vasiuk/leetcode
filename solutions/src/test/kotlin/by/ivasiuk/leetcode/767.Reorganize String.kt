package by.ivasiuk.leetcode

import kotlin.test.Test
import kotlin.test.assertEquals

class ReorganizeStringTest {
  private val solution = ReorganizeString()

  @Test
  fun example1() {
    assertEquals(
      expected = "aba",
      actual = solution.reorganizeString(
        s = "aab"
      )
    )
  }

  @Test
  fun example2() {
    assertEquals(
      expected = "",
      actual = solution.reorganizeString(
        s = "aaab"
      )
    )
  }
}
