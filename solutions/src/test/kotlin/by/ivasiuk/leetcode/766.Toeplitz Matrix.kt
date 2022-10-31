package by.ivasiuk.leetcode

import kotlin.test.Test
import kotlin.test.assertFalse
import kotlin.test.assertTrue

class ToeplitzMatrixTest {
  private val solution = ToeplitzMatrix()

  @Test
  fun example1() {
    assertTrue {
      solution.isToeplitzMatrix(
        matrix = arrayOf(
          intArrayOf(1, 2, 3, 4),
          intArrayOf(5, 1, 2, 3),
          intArrayOf(9, 5, 1, 2),
        )
      )
    }
  }

  @Test
  fun example2() {
    assertFalse {
      solution.isToeplitzMatrix(
        matrix = arrayOf(
          intArrayOf(1, 2),
          intArrayOf(2, 2),
        )
      )
    }
  }
}