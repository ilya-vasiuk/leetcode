package by.ivasiuk.leetcode

import kotlin.test.Test
import kotlin.test.assertContentEquals

class DiagonalTraverse2Test {
  private val solution = DiagonalTraverse2()

  @Test
  fun example1() {
    assertContentEquals(
      expected = intArrayOf(1, 4, 2, 7, 5, 3, 8, 6, 9),
      actual = solution.findDiagonalOrder(
        nums = listOf(
          listOf(1, 2, 3),
          listOf(4, 5, 6),
          listOf(7, 8, 9),
        )
      )
    )
  }

  @Test
  fun example2() {
    assertContentEquals(
      expected = intArrayOf(1, 6, 2, 8, 7, 3, 9, 4, 12, 10, 5, 13, 11, 14, 15, 16),
      actual = solution.findDiagonalOrder(
        nums = listOf(
          listOf(1, 2, 3, 4, 5),
          listOf(6, 7),
          listOf(8),
          listOf(9, 10, 11),
          listOf(12, 13, 14, 15, 16),
        )
      )
    )
  }
}
