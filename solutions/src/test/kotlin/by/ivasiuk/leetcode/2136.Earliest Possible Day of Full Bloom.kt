package by.ivasiuk.leetcode

import kotlin.test.Test
import kotlin.test.assertEquals

class EarliestPossibleDayOfFullBloomTest {
  private val solution = EarliestPossibleDayOfFullBloom()

  @Test
  fun example1() {
    assertEquals(
      expected = 9,
      actual = solution.earliestFullBloom(
        plantTime = intArrayOf(1, 2, 3, 2),
        growTime = intArrayOf(2, 1, 2, 1),
      )
    )
  }

  @Test
  fun example2() {
    assertEquals(
      expected = 2,
      actual = solution.earliestFullBloom(
        plantTime = intArrayOf(1),
        growTime = intArrayOf(1),
      )
    )
  }
}