package by.ivasiuk.leetcode

import kotlin.test.Test
import kotlin.test.assertEquals

class BestTeamWithNoConflictsTest {
  private val solution = BestTeamWithNoConflicts()

  @Test
  fun example1() {
    assertEquals(
      expected = 34,
      actual = solution.bestTeamScore(
        scores = intArrayOf(1, 3, 5, 10, 15),
        ages = intArrayOf(1, 2, 3, 4, 5)
      )
    )
  }

  @Test
  fun example2() {
    assertEquals(
      expected = 16,
      actual = solution.bestTeamScore(
        scores = intArrayOf(4, 5, 6, 5),
        ages = intArrayOf(2, 1, 2, 1)
      )
    )
  }

  @Test
  fun example3() {
    assertEquals(
      expected = 6,
      actual = solution.bestTeamScore(
        scores = intArrayOf(1, 2, 3, 5),
        ages = intArrayOf(8, 9, 10, 1)
      )
    )
  }
}