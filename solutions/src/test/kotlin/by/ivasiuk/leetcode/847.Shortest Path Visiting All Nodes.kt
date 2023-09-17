package by.ivasiuk.leetcode

import kotlin.test.Test
import kotlin.test.assertEquals

class ShortestPathVisitingAllNodesTest {
  private val solution = ShortestPathVisitingAllNodes()

  @Test
  fun example1() {
    assertEquals(
      expected = 4,
      actual = solution.shortestPathLength(
        graph = arrayOf(
          intArrayOf(1, 2, 3),
          intArrayOf(0),
          intArrayOf(0),
          intArrayOf(0),
        )
      )
    )
  }

  @Test
  fun example2() {
    assertEquals(
      expected = 4,
      actual = solution.shortestPathLength(
        graph = arrayOf(
          intArrayOf(1),
          intArrayOf(0, 2, 4),
          intArrayOf(1, 3, 4),
          intArrayOf(2),
          intArrayOf(1, 2),
        )
      )
    )
  }
}
