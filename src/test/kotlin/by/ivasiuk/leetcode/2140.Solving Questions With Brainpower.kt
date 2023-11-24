package by.ivasiuk.leetcode

import kotlin.test.Test
import kotlin.test.assertEquals

class SolvingQuestionsWithBrainpowerTest {
  private val solution = SolvingQuestionsWithBrainpower()

  @Test
  fun example1() {
    assertEquals(
      expected = 5,
      actual = solution.mostPoints(
        questions = arrayOf(
          intArrayOf(3, 2),
          intArrayOf(4, 3),
          intArrayOf(4, 4),
          intArrayOf(2, 5),
        )
      )
    )
  }

  @Test
  fun example2() {
    assertEquals(
      expected = 7,
      actual = solution.mostPoints(
        questions = arrayOf(
          intArrayOf(1, 1),
          intArrayOf(2, 2),
          intArrayOf(3, 3),
          intArrayOf(4, 4),
          intArrayOf(5, 5),
        )
      )
    )
  }
}
