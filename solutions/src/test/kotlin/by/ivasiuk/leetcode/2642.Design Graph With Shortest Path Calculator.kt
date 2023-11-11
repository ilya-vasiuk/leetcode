package by.ivasiuk.leetcode

import kotlin.test.Test
import kotlin.test.assertEquals

class DesignGraphWithShortestPathCalculatorTest {

  @Test
  fun example1() {
    val graph = Graph(
      n = 4,
      edges = arrayOf(
        intArrayOf(0, 2, 5),
        intArrayOf(0, 1, 2),
        intArrayOf(1, 2, 1),
        intArrayOf(3, 0, 3)
      )
    )

    assertEquals(
      expected = 6,
      actual = graph.shortestPath(3, 2),
    )
    assertEquals(
      expected = -1,
      actual = graph.shortestPath(0, 3),
    )

    graph.addEdge(
      edge = intArrayOf(1, 3, 4)
    )

    assertEquals(
      expected = 6,
      actual = graph.shortestPath(0, 3),
    )
  }
}
