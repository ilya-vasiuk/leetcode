package by.ivasiuk.leetcode

import kotlin.test.Test
import kotlin.test.assertEquals

class FindTheDifferenceTest {
  private val solution = FindTheDifference()

  @Test
  fun example1() {
    assertEquals(
      expected = 'e',
      actual = solution.findTheDifference(
        s = "abcd",
        t = "abcde",
      )
    )
  }

  @Test
  fun example2() {
    assertEquals(
      expected = 'y',
      actual = solution.findTheDifference(
        s = "",
        t = "y",
      )
    )
  }
}
