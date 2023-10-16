package by.ivasiuk.leetcode

import kotlin.test.Test
import kotlin.test.assertContentEquals

class PascalsTriangle2Test {
  private val solution = PascalsTriangle2()

  @Test
  fun example1() {
    assertContentEquals(
      expected = listOf(1,3,3,1),
      actual = solution.getRow(
        rowIndex = 3
      )
    )
  }

  @Test
  fun example2() {
    assertContentEquals(
      expected = listOf(1),
      actual = solution.getRow(
        rowIndex = 0
      )
    )
  }

  @Test
  fun example3() {
    assertContentEquals(
      expected = listOf(1, 1),
      actual = solution.getRow(
        rowIndex = 1
      )
    )
  }
}
