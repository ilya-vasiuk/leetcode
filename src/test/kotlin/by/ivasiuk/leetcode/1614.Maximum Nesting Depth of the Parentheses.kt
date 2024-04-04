package by.ivasiuk.leetcode

import kotlin.test.Test
import kotlin.test.assertEquals

class MaximumNestingDepthOfTheParenthesesTest {
  private val solution = MaximumNestingDepthOfTheParentheses()

  @Test
  fun example1() {
    assertEquals(
      expected = 3,
      actual = solution.maxDepth(
        s = "(1+(2*3)+((8)/4))+1"
      )
    )
  }

  @Test
  fun example2() {
    assertEquals(
      expected = 3,
      actual = solution.maxDepth(
        s = "(1)+((2))+(((3)))"
      )
    )
  }
}
