package by.ivasiuk.leetcode

import kotlin.test.Test
import kotlin.test.assertEquals

class MinimumRoundsToCompleteAllTasksTest {
  private val solution = MinimumRoundsToCompleteAllTasks()

  @Test
  fun example1() {
    assertEquals(
      expected = 4,
      actual = solution.minimumRounds(
        tasks = intArrayOf(2, 2, 3, 3, 2, 4, 4, 4, 4, 4)
      )
    )
  }

  @Test
  fun example2() {
    assertEquals(
      expected = -1,
      actual = solution.minimumRounds(
        tasks = intArrayOf(2, 3, 3)
      )
    )
  }
}
