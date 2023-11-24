package by.ivasiuk.leetcode

import kotlin.test.Test
import kotlin.test.assertEquals

class MatrixDiagonalSumTest {
  private val solution = MatrixDiagonalSum()

  @Test
  fun example1() {
    assertEquals(
      expected = 25,
      actual = solution.diagonalSum(
        mat = arrayOf(
          intArrayOf(1, 2, 3),
          intArrayOf(4, 5, 6),
          intArrayOf(7, 8, 9),
        )
      )
    )
  }

  @Test
  fun example2() {
    assertEquals(
      expected = 8,
      actual = solution.diagonalSum(
        mat = arrayOf(
          intArrayOf(1, 1, 1, 1),
          intArrayOf(1, 1, 1, 1),
          intArrayOf(1, 1, 1, 1),
          intArrayOf(1, 1, 1, 1),
        )
      )
    )
  }

  @Test
  fun example3() {
    assertEquals(
      expected = 5,
      actual = solution.diagonalSum(
        mat = arrayOf(
          intArrayOf(5),
        )
      )
    )
  }
}