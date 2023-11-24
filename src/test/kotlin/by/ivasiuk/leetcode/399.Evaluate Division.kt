package by.ivasiuk.leetcode

import kotlin.test.Test
import kotlin.test.assertContentEquals

class EvaluateDivisionTest {
  private val solution = EvaluateDivision()

  @Test
  fun example1() {
    assertContentEquals(
      expected = doubleArrayOf(6.0, 0.5, -1.0, 1.0, -1.0),
      actual = solution.calcEquation(
        equations = listOf(listOf("a", "b"), listOf("b", "c")),
        values = doubleArrayOf(2.0, 3.0),
        queries = listOf(listOf("a", "c"), listOf("b", "a"), listOf("a", "e"), listOf("a", "a"), listOf("x", "x"))
      )
    )
  }

  @Test
  fun example2() {
    assertContentEquals(
      expected = doubleArrayOf(3.75000, 0.40000, 5.00000, 0.20000),
      actual = solution.calcEquation(
        equations = listOf(listOf("a", "b"), listOf("b", "c"), listOf("bc", "cd")),
        values = doubleArrayOf(1.5, 2.5, 5.0),
        queries = listOf(listOf("a", "c"), listOf("c", "b"), listOf("bc", "cd"), listOf("cd", "bc"))
      )
    )
  }

  @Test
  fun example3() {
    assertContentEquals(
      expected = doubleArrayOf(0.5, 2.0, -1.0, -1.0),
      actual = solution.calcEquation(
        equations = listOf(listOf("a", "b")),
        values = doubleArrayOf(0.5),
        queries = listOf(listOf("a", "b"), listOf("b", "a"), listOf("a", "c"), listOf("x", "y"))
      )
    )
  }
}
