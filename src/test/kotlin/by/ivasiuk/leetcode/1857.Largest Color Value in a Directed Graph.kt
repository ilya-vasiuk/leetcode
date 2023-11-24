package by.ivasiuk.leetcode

import kotlin.test.Test
import kotlin.test.assertEquals

class LargestColorValueInADirectedGraphTest {
  private val solution = LargestColorValueInADirectedGraph()

  @Test
  fun example1() {
    assertEquals(
      expected = 3,
      actual = solution.largestPathValue(
        colors = "abaca",
        edges = arrayOf(
          intArrayOf(0, 1),
          intArrayOf(0, 2),
          intArrayOf(2, 3),
          intArrayOf(3, 4),
        )
      )
    )
  }

  @Test
  fun example2() {
    assertEquals(
      expected = -1,
      actual = solution.largestPathValue(
        colors = "a",
        edges = arrayOf(
          intArrayOf(0, 0),
        )
      )
    )
  }
}
