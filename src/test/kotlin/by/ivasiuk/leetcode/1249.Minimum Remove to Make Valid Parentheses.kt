package by.ivasiuk.leetcode

import kotlin.test.Test
import kotlin.test.assertEquals

class MinimumRemoveToMakeValidParenthesesTest {
  private val solution = MinimumRemoveToMakeValidParentheses()

  @Test
  fun example1() {
    assertEquals(
      expected = "lee(t(c)o)de",
      actual = solution.minRemoveToMakeValid(
        s = "lee(t(c)o)de)",
      )
    )
  }

  @Test
  fun example2() {
    assertEquals(
      expected = "ab(c)d",
      actual = solution.minRemoveToMakeValid(
        s = "a)b(c)d",
      )
    )
  }

  @Test
  fun example3() {
    assertEquals(
      expected = "",
      actual = solution.minRemoveToMakeValid(
        s = "))((",
      )
    )
  }
}
