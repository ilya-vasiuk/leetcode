package by.ivasiuk.leetcode

import kotlin.test.Test
import kotlin.test.assertEquals

class IntegerBreakTest {
  private val solution = IntegerBreak()

  @Test
  fun example1() {
    assertEquals(
      expected = 1,
      actual = solution.integerBreak(
        n = 2
      )
    )
  }

  @Test
  fun example2() {
    assertEquals(
      expected = 36,
      actual = solution.integerBreak(
        n = 10
      )
    )
  }
}