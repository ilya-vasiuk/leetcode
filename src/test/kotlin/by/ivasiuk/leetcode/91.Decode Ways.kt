package by.ivasiuk.leetcode

import kotlin.test.Test
import kotlin.test.assertEquals

class DecodeWaysTest {
  private val solution = DecodeWays()

  @Test
  fun example1() {
    assertEquals(
      expected = 2,
      actual = solution.numDecodings(
        s = "12"
      )
    )
  }

  @Test
  fun example2() {
    assertEquals(
      expected = 3,
      actual = solution.numDecodings(
        s = "226"
      )
    )
  }

  @Test
  fun example3() {
    assertEquals(
      expected = 0,
      actual = solution.numDecodings(
        s = "06"
      )
    )
  }
}
