package by.ivasiuk.leetcode

import kotlin.test.Test
import kotlin.test.assertEquals

class CountWaysToBuildGoodStringsTest {
  private val solution = CountWaysToBuildGoodStrings()

  @Test
  fun example1() {
    assertEquals(
      expected = 8,
      actual = solution.countGoodStrings(
        low = 3,
        high = 3,
        zero = 1,
        one = 1
      )
    )
  }

  @Test
  fun example2() {
    assertEquals(
      expected = 5,
      actual = solution.countGoodStrings(
        low = 2,
        high = 3,
        zero = 1,
        one = 2
      )
    )
  }
}
