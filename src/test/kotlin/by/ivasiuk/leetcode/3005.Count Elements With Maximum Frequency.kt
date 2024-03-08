package by.ivasiuk.leetcode

import kotlin.test.Test
import kotlin.test.assertEquals

class CountElementsWithMaximumFrequencyTest {
  private val solution = CountElementsWithMaximumFrequency()

  @Test
  fun example1() {
    assertEquals(
      expected = 4,
      actual = solution.maxFrequencyElements(
        nums = intArrayOf(1, 2, 2, 3, 1, 4),
      )
    )
  }

  @Test
  fun example2() {
    assertEquals(
      expected = 5,
      actual = solution.maxFrequencyElements(
        nums = intArrayOf(1, 2, 3, 4, 5),
      )
    )
  }

}
