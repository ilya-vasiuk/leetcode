package by.ivasiuk.leetcode

import kotlin.test.Test
import kotlin.test.assertEquals

class FrequencyOfTheMostFrequentElementTest {
  private val solution = FrequencyOfTheMostFrequentElement()

  @Test
  fun example1() {
    assertEquals(
      expected = 3,
      actual = solution.maxFrequency(
        nums = intArrayOf(1, 2, 4),
        k = 5
      )
    )
  }

  @Test
  fun example2() {
    assertEquals(
      expected = 2,
      actual = solution.maxFrequency(
        nums = intArrayOf(1, 4, 8, 13),
        k = 5
      )
    )
  }

  @Test
  fun example3() {
    assertEquals(
      expected = 1,
      actual = solution.maxFrequency(
        nums = intArrayOf(3, 9, 6),
        k = 2
      )
    )
  }
}
