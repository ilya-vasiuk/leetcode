package by.ivasiuk.leetcode

import kotlin.test.Test
import kotlin.test.assertEquals

class PerfectSquaresTest {
  private val solution = PerfectSquares()

  @Test
  fun example1() {
    assertEquals(
      expected = 3,
      actual = solution.numSquares(
        n = 12
      )
    )
  }

  @Test
  fun example2() {
    assertEquals(
      expected = 2,
      actual = solution.numSquares(
        n = 13
      )
    )
  }
}
