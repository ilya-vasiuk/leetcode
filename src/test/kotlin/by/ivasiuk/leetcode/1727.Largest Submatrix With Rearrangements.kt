package by.ivasiuk.leetcode

import kotlin.test.Test
import kotlin.test.assertEquals

class LargestSubmatrixWithRearrangementsTest {
  private val solution = LargestSubmatrixWithRearrangements()

  @Test
  fun example1() {
    assertEquals(
      expected = 4,
      actual = solution.largestSubmatrix(
        matrix = arrayOf(
          intArrayOf(0, 0, 1),
          intArrayOf(1, 1, 1),
          intArrayOf(1, 0, 1),
        )
      )
    )
  }

  @Test
  fun example2() {
    assertEquals(
      expected = 3,
      actual = solution.largestSubmatrix(
        matrix = arrayOf(
          intArrayOf(1, 0, 1, 0, 1),
        )
      )
    )
  }

  @Test
  fun example3() {
    assertEquals(
      expected = 2,
      actual = solution.largestSubmatrix(
        matrix = arrayOf(
          intArrayOf(1, 1, 0),
          intArrayOf(1, 0, 1),
        )
      )
    )
  }
}
