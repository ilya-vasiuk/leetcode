package by.ivasiuk.leetcode

import kotlin.test.Test
import kotlin.test.assertEquals

class ShortestPathInAGridWithObstaclesEliminationTest {
  private val solution = ShortestPathInAGridWithObstaclesElimination()

  @Test
  fun example1() {
    assertEquals(
      expected = 6,
      actual = solution.shortestPath(
        grid = arrayOf(
          intArrayOf(0,0,0),
          intArrayOf(1,1,0),
          intArrayOf(0,0,0),
          intArrayOf(0,1,1),
          intArrayOf(0,0,0),
        ),
        k = 1,
      )
    )
  }

  @Test
  fun example2() {
    assertEquals(
      expected = -1,
      actual = solution.shortestPath(
        grid = arrayOf(
          intArrayOf(0,1,1),
          intArrayOf(1,1,1),
          intArrayOf(1,0,0),
        ),
        k = 1,
      )
    )
  }
}