package by.ivasiuk.leetcode

import kotlin.test.Test
import kotlin.test.assertEquals

class SpecialPositionsInABinaryMatrixTest {
  private val solution = SpecialPositionsInABinaryMatrix()

  @Test
  fun example1() {
    assertEquals(
      expected = 1,
      actual = solution.numSpecial(
        mat = arrayOf(
          intArrayOf(1, 0, 0),
          intArrayOf(0, 0, 1),
          intArrayOf(1, 0, 0),
        )
      )
    )
  }

  @Test
  fun example2() {
    assertEquals(
      expected = 3,
      actual = solution.numSpecial(
        mat = arrayOf(
          intArrayOf(1, 0, 0),
          intArrayOf(0, 1, 0),
          intArrayOf(0, 0, 1),
        )
      )
    )
  }
}
