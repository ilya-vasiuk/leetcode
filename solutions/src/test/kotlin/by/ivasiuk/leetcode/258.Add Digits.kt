package by.ivasiuk.leetcode

import kotlin.test.Test
import kotlin.test.assertEquals

class AddDigitsTest {
  private val solution = AddDigits()

  @Test
  fun example1() {
    assertEquals(
      expected = 2,
      actual = solution.addDigits(
        num = 38
      )
    )
  }

  @Test
  fun example2() {
    assertEquals(
      expected = 0,
      actual = solution.addDigits(
        num = 0
      )
    )
  }
}
