package by.ivasiuk.leetcode

import kotlin.test.Test
import kotlin.test.assertContentEquals

class PascalsTriangleTest {
  private val solution = PascalsTriangle()

  @Test
  fun example1() {
    val expected = listOf(
      listOf(1),
      listOf(1, 1),
      listOf(1, 2, 1),
      listOf(1, 3, 3, 1),
      listOf(1, 4, 6, 4, 1),
    )

    val result = solution.generate(5)
    assertContentEquals(expected, result)
  }

  @Test
  fun example2() {
    val expected = listOf(
      listOf(1),
    )

    assertContentEquals(expected, solution.generate(1))
  }
}