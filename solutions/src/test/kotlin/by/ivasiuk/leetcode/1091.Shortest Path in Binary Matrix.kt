package by.ivasiuk.leetcode

import kotlin.test.Test
import kotlin.test.assertEquals

class ShortestPathInBinaryMatrixTest {
  private val solution = ShortestPathInBinaryMatrix()

  @Test
  fun example1() {
    assertEquals(
      expected = 2,
      actual = solution.shortestPathBinaryMatrix(
        grid = arrayOf(
          intArrayOf(0, 1),
          intArrayOf(1, 0),
        )
      )
    )
  }

  @Test
  fun example2() {
    assertEquals(
      expected = 4,
      actual = solution.shortestPathBinaryMatrix(
        grid = arrayOf(
          intArrayOf(0, 0, 0),
          intArrayOf(1, 1, 0),
          intArrayOf(1, 1, 0),
        )
      )
    )
  }

  @Test
  fun example3() {
    assertEquals(
      expected = -1,
      actual = solution.shortestPathBinaryMatrix(
        grid = arrayOf(
          intArrayOf(1, 0, 0),
          intArrayOf(1, 1, 0),
          intArrayOf(1, 1, 0),
        )
      )
    )
  }

  @Test
  fun example4() {
    assertEquals(
      expected = 7,
      actual = solution.shortestPathBinaryMatrix(
        grid = arrayOf(
          intArrayOf(0, 1, 0, 0, 0, 0),
          intArrayOf(0, 1, 1, 1, 1, 1),
          intArrayOf(0, 0, 0, 0, 1, 1),
          intArrayOf(0, 1, 0, 0, 0, 1),
          intArrayOf(1, 0, 0, 1, 0, 1),
          intArrayOf(0, 0, 1, 0, 1, 0),
        )
      )
    )
  }
}