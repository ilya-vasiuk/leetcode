package by.ivasiuk.leetcode

import kotlin.test.Test
import kotlin.test.assertContentEquals

class SpiralMatrixTest {
  private val solution = SpiralMatrix()

  @Test
  fun example1() {
    val matrix = arrayOf(
      intArrayOf(1, 2, 3),
      intArrayOf(4, 5, 6),
      intArrayOf(7, 8, 9),
    )
    val result = solution.spiralOrder(matrix)
    assertContentEquals(listOf(1, 2, 3, 6, 9, 8, 7, 4, 5), result)
  }

  @Test
  fun example2() {
    val matrix = arrayOf(
      intArrayOf(1, 2, 3, 4),
      intArrayOf(5, 6, 7, 8),
      intArrayOf(9, 10, 11, 12),
    )
    val result = solution.spiralOrder(matrix)
    assertContentEquals(listOf(1, 2, 3, 4, 8, 12, 11, 10, 9, 5, 6, 7), result)
  }

  @Test
  fun example3() {
    val matrix = arrayOf(
      intArrayOf(1),
    )
    val result = solution.spiralOrder(matrix)
    assertContentEquals(listOf(1), result)
  }
}