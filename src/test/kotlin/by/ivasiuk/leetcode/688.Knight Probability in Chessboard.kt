package by.ivasiuk.leetcode

import kotlin.test.Test
import kotlin.test.assertEquals

class KnightProbabilityInChessboardTest {
  private val solution = KnightProbabilityInChessboard()

  @Test
  fun example1() {
    assertEquals(
      expected = 0.06250,
      actual = solution.knightProbability(
        n = 3,
        k = 2,
        row = 0,
        col = 0,
      )
    )
  }

  @Test
  fun example2() {
    assertEquals(
      expected = 1.00000,
      actual = solution.knightProbability(
        n = 1,
        k = 0,
        row = 0,
        col = 0,
      )
    )
  }
}
