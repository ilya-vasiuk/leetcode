package by.ivasiuk.leetcode

import kotlin.test.Test
import kotlin.test.assertEquals

class MaximumScoreAfterSplittingAStringTest {
  private val solution = MaximumScoreAfterSplittingAString()

  @Test
  fun example1() {
    assertEquals(
      expected = 5,
      actual = solution.maxScore(
        s = "011101"
      )
    )
  }

  @Test
  fun example2() {
    assertEquals(
      expected = 5,
      actual = solution.maxScore(
        s = "00111"
      )
    )
  }

  @Test
  fun example3() {
    assertEquals(
      expected = 3,
      actual = solution.maxScore(
        s = "1111"
      )
    )
  }
}
