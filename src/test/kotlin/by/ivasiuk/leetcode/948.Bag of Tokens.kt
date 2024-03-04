package by.ivasiuk.leetcode

import kotlin.test.Test
import kotlin.test.assertEquals

class BagOfTokensTest {
  private val solution = BagOfTokens()

  @Test
  fun example1() {
    assertEquals(
      expected = 0,
      actual = solution.bagOfTokensScore(
        tokens = intArrayOf(100),
        power = 50,
      )
    )
  }

  @Test
  fun example2() {
    assertEquals(
      expected = 1,
      actual = solution.bagOfTokensScore(
        tokens = intArrayOf(200, 100),
        power = 150,
      )
    )
  }

  @Test
  fun example3() {
    assertEquals(
      expected = 2,
      actual = solution.bagOfTokensScore(
        tokens = intArrayOf(100, 200, 300, 400),
        power = 200,
      )
    )
  }
}
