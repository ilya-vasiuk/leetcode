package by.ivasiuk.leetcode

import kotlin.test.Test
import kotlin.test.assertEquals

class MaximalNetworkRankTest {
  private val solution = MaximalNetworkRank()

  @Test
  fun example1() {
    assertEquals(
      expected = 4,
      actual = solution.maximalNetworkRank(
        n = 4,
        roads = arrayOf(
          intArrayOf(0, 1),
          intArrayOf(0, 3),
          intArrayOf(1, 2),
          intArrayOf(1, 3),
        )
      )
    )
  }

  @Test
  fun example2() {
    assertEquals(
      expected = 5,
      actual = solution.maximalNetworkRank(
        n = 5,
        roads = arrayOf(
          intArrayOf(0, 1),
          intArrayOf(0, 3),
          intArrayOf(1, 2),
          intArrayOf(1, 3),
          intArrayOf(2, 3),
          intArrayOf(2, 4),
        )
      )
    )
  }

  @Test
  fun example3() {
    assertEquals(
      expected = 5,
      actual = solution.maximalNetworkRank(
        n = 8,
        roads = arrayOf(
          intArrayOf(0, 1),
          intArrayOf(1, 2),
          intArrayOf(2, 3),
          intArrayOf(2, 4),
          intArrayOf(5, 6),
          intArrayOf(5, 7),
        )
      )
    )
  }
}
