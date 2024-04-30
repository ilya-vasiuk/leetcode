package by.ivasiuk.leetcode

import kotlin.test.Test
import kotlin.test.assertEquals

class NumberOfWonderfulSubstringsTest {
  private val solution = NumberOfWonderfulSubstrings()

  @Test
  fun example1() {
    assertEquals(
      expected = 4,
      actual = solution.wonderfulSubstrings(
        word = "aba",
      )
    )
  }

  @Test
  fun example2() {
    assertEquals(
      expected = 9,
      actual = solution.wonderfulSubstrings(
        word = "aabb",
      )
    )
  }

  @Test
  fun example3() {
    assertEquals(
      expected = 2,
      actual = solution.wonderfulSubstrings(
        word = "he",
      )
    )
  }
}
