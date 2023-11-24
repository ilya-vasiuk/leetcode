package by.ivasiuk.leetcode

import kotlin.test.Test
import kotlin.test.assertEquals

class MinimumFlipsToMakeAOrBEqualToCTest {
  private val solution = MinimumFlipsToMakeAOrBEqualToC()

  @Test
  fun example1() {
    assertEquals(
      expected = 3,
      actual = solution.minFlips(
        a = 2,
        b = 6,
        c = 5
      )
    )
  }

  @Test
  fun example2() {
    assertEquals(
      expected = 1,
      actual = solution.minFlips(
        a = 4,
        b = 2,
        c = 7
      )
    )
  }

  @Test
  fun example3() {
    assertEquals(
      expected = 0,
      actual = solution.minFlips(
        a = 1,
        b = 2,
        c = 3
      )
    )
  }
}
