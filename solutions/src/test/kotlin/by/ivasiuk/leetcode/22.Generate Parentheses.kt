package by.ivasiuk.leetcode

import kotlin.test.Test
import kotlin.test.assertContentEquals

class GenerateParenthesesTest {
  private val solution = GenerateParentheses()

  @Test
  fun example1() {
    assertContentEquals(
      expected = listOf("((()))","(()())","(())()","()(())","()()()"),
      actual = solution.generateParenthesis(3)
    )
  }

  @Test
  fun example2() {
    assertContentEquals(
      expected = listOf("()"),
      actual = solution.generateParenthesis(1)
    )
  }
}