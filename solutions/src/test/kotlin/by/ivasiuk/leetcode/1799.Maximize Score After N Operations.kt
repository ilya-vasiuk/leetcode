package by.ivasiuk.leetcode

import kotlin.test.Test
import kotlin.test.assertEquals

class MaximizeScoreAfterNOperationsTest {
  private val solution = MaximizeScoreAfterNOperations()

  @Test
  fun example1() {
    assertEquals(
      expected = 1,
      actual = solution.maxScore(
        nums = intArrayOf(1, 2)
      )
    )
  }

  @Test
  fun example2() {
    assertEquals(
      expected = 11,
      actual = solution.maxScore(
        nums = intArrayOf(3, 4, 6, 8)
      )
    )
  }

  @Test
  fun example3() {
    assertEquals(
      expected = 14,
      actual = solution.maxScore(
        nums = intArrayOf(1, 2, 3, 4, 5, 6)
      )
    )
  }
}
