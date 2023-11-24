package by.ivasiuk.leetcode

import kotlin.test.Test
import kotlin.test.assertFalse
import kotlin.test.assertTrue

class SearchA2DMatrixTest {
  private val solution = SearchA2DMatrix()

  @Test
  fun example1() {
    val matrix = arrayOf(
      intArrayOf(1,3,5,7),
      intArrayOf(10,11,16,20),
      intArrayOf(23,30,34,60),
    )

    assertTrue {
      solution.searchMatrix(matrix, 3)
    }
  }

  @Test
  fun example2() {
    val matrix = arrayOf(
      intArrayOf(1,3,5,7),
      intArrayOf(10,11,16,20),
      intArrayOf(23,30,34,60),
    )

    assertFalse {
      solution.searchMatrix(matrix, 13)
    }
  }
}