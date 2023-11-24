package by.ivasiuk.leetcode

import kotlin.test.Test
import kotlin.test.assertContentEquals

class ShortestPathWithAlternatingColorsTest {
  private val solution = ShortestPathWithAlternatingColors()

  @Test
  fun example1() {
    assertContentEquals(
      expected = intArrayOf(0, 1, -1),
      actual = solution.shortestAlternatingPaths(
        n = 3,
        redEdges = arrayOf(
          intArrayOf(0, 1),
          intArrayOf(1, 2),
        ),
        blueEdges = arrayOf(),
      )
    )
  }

  @Test
  fun example2() {
    assertContentEquals(
      expected = intArrayOf(0, 1, -1),
      actual = solution.shortestAlternatingPaths(
        n = 3,
        redEdges = arrayOf(
          intArrayOf(0, 1),
        ),
        blueEdges = arrayOf(
          intArrayOf(2, 1),
        ),
      )
    )
  }
}
