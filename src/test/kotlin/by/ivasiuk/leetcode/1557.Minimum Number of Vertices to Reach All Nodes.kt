package by.ivasiuk.leetcode

import kotlin.test.Test
import kotlin.test.assertContentEquals

class MinimumNumberOfVerticesToReachAllNodesTest {
  private val solution = MinimumNumberOfVerticesToReachAllNodes()

  @Test
  fun example1() {
    assertContentEquals(
      expected = listOf(0, 3),
      actual = solution.findSmallestSetOfVertices(
        n = 6,
        edges = listOf(
          listOf(0, 1),
          listOf(0, 2),
          listOf(2, 5),
          listOf(3, 4),
          listOf(4, 2),
        )
      )
    )
  }

  @Test
  fun example2() {
    assertContentEquals(
      expected = listOf(0, 2, 3),
      actual = solution.findSmallestSetOfVertices(
        n = 5,
        edges = listOf(
          listOf(0, 1),
          listOf(2, 1),
          listOf(3, 1),
          listOf(1, 4),
          listOf(2, 4),
        )
      )
    )
  }
}
