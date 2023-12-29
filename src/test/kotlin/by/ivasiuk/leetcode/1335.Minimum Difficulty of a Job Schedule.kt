package by.ivasiuk.leetcode

import kotlin.test.Test
import kotlin.test.assertEquals

class MinimumDifficultyOfAJobScheduleTest {
  private val solution = MinimumDifficultyOfAJobSchedule()

  @Test
  fun example1() {
    assertEquals(
      expected = 7,
      actual = solution.minDifficulty(
        jobDifficulty = intArrayOf(6, 5, 4, 3, 2, 1),
        d = 2,
      )
    )
  }

  @Test
  fun example2() {
    assertEquals(
      expected = -1,
      actual = solution.minDifficulty(
        jobDifficulty = intArrayOf(9, 9, 9),
        d = 4,
      )
    )
  }

  @Test
  fun example3() {
    assertEquals(
      expected = 3,
      actual = solution.minDifficulty(
        jobDifficulty = intArrayOf(1, 1, 1),
        d = 3,
      )
    )
  }
}
