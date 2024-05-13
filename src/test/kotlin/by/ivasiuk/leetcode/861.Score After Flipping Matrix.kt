package by.ivasiuk.leetcode

import kotlin.test.Test
import kotlin.test.assertEquals

class ScoreAfterFlippingMatrixTest {
  private val solution = ScoreAfterFlippingMatrix()

  @Test
  fun example1() {
    assertEquals(
      expected = 39,
      actual = solution.matrixScore(
        grid = arrayOf(
          intArrayOf(0, 0, 1, 1),
          intArrayOf(1, 0, 1, 0),
          intArrayOf(1, 1, 0, 0),
        )
      )
    )
  }

  @Test
  fun example2() {
    assertEquals(
      expected = 1,
      actual = solution.matrixScore(
        grid = arrayOf(
          intArrayOf(0),
        )
      )
    )
  }
}
