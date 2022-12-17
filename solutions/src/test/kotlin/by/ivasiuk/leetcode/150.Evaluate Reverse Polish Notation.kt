package by.ivasiuk.leetcode

import kotlin.test.Test
import kotlin.test.assertEquals

class EvaluateReversePolishNotationTest {
  private val solution = EvaluateReversePolishNotation()

  @Test
  fun example1() {
    assertEquals(
      expected = 9,
      actual = solution.evalRPN(
        tokens = arrayOf("2", "1", "+", "3", "*")
      )
    )
  }

  @Test
  fun example2() {
    assertEquals(
      expected = 6,
      actual = solution.evalRPN(
        tokens = arrayOf("4", "13", "5", "/", "+")
      )
    )
  }
}
