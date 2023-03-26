package by.ivasiuk.leetcode

import kotlin.test.Test
import kotlin.test.assertEquals

class CountUnreachablePairsOfNodesInAnUndirectedGraphTest {
  private val solution = CountUnreachablePairsOfNodesInAnUndirectedGraph()

  @Test
  fun example1() {
    assertEquals(
      expected = 0,
      actual = solution.countPairs(
        n = 3,
        edges = arrayOf(
          intArrayOf(0, 1),
          intArrayOf(0, 2),
          intArrayOf(1, 2),
        )
      )
    )
  }

  @Test
  fun example2() {
    assertEquals(
      expected = 14,
      actual = solution.countPairs(
        n = 7,
        edges = arrayOf(
          intArrayOf(0, 2),
          intArrayOf(0, 5),
          intArrayOf(2, 4),
          intArrayOf(1, 6),
          intArrayOf(5, 4),
        )
      )
    )
  }
}
