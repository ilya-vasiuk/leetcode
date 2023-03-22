package by.ivasiuk.leetcode

import kotlin.test.Test
import kotlin.test.assertEquals

class MinimumScoreOfAPathBetweenTwoCitiesTest {
  private val solution = MinimumScoreOfAPathBetweenTwoCities()

  @Test
  fun example1() {
    assertEquals(
      expected = 5,
      actual = solution.minScore(
        n = 4,
        roads = arrayOf(
          intArrayOf(1, 2, 9),
          intArrayOf(2, 3, 6),
          intArrayOf(2, 4, 5),
          intArrayOf(1, 4, 7),
        )
      )
    )
  }

  @Test
  fun example2() {
    assertEquals(
      expected = 2,
      actual = solution.minScore(
        n = 4,
        roads = arrayOf(
          intArrayOf(1, 2, 2),
          intArrayOf(1, 3, 4),
          intArrayOf(3, 4, 7),
        )
      )
    )
  }
}
