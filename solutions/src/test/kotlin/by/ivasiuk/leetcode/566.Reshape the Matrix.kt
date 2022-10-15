package by.ivasiuk.leetcode

import kotlin.test.Test
import kotlin.test.assertContentEquals

class ReshapeTheMatrixTest {
  private val solution = ReshapeTheMatrix()

  @Test
  fun example1() {
    val mat = arrayOf(
      intArrayOf(1, 2),
      intArrayOf(3, 4),
    )
    val expected = arrayOf(
      intArrayOf(1, 2, 3, 4)
    )

    val result = solution.matrixReshape(mat, 1, 4)
    for (i in expected.indices) {
      assertContentEquals(expected[i], result[i])
    }
  }

  @Test
  fun example2() {
    val mat = arrayOf(
      intArrayOf(1, 2),
      intArrayOf(3, 4),
    )
    val expected = mat.clone()

    val result = solution.matrixReshape(mat, 2, 4)
    for (i in expected.indices) {
      assertContentEquals(expected[i], result[i])
    }
  }
}