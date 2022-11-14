package by.ivasiuk.leetcode

import kotlin.test.Test
import kotlin.test.assertEquals

class CountOddNumbersInAnIntervalRangeTest {
  private val solution = CountOddNumbersInAnIntervalRange()

  @Test
  fun example1() {
    assertEquals(
      expected = 3,
      actual = solution.countOdds(
        low = 3,
        high = 7,
      )
    )
  }

  @Test
  fun example2() {
    assertEquals(
      expected = 1,
      actual = solution.countOdds(
        low = 8,
        high = 10,
      )
    )
  }
}