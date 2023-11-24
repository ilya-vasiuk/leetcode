package by.ivasiuk.leetcode

import kotlin.test.Test
import kotlin.test.assertEquals

class ShortestBridgeTest {
  private val solution = ShortestBridge()

  @Test
  fun example1() {
    assertEquals(
      expected = 1,
      actual = solution.shortestBridge(
        grid = arrayOf(
          intArrayOf(0, 1),
          intArrayOf(1, 0),
        )
      )
    )
  }

  @Test
  fun example2() {
    assertEquals(
      expected = 2,
      actual = solution.shortestBridge(
        grid = arrayOf(
          intArrayOf(0, 1, 0),
          intArrayOf(0, 0, 0),
          intArrayOf(0, 0, 1),
        )
      )
    )
  }

  @Test
  fun example3() {
    assertEquals(
      expected = 1,
      actual = solution.shortestBridge(
        grid = arrayOf(
          intArrayOf(1, 1, 1, 1, 1),
          intArrayOf(1, 0, 0, 0, 1),
          intArrayOf(1, 0, 1, 0, 1),
          intArrayOf(1, 0, 0, 0, 1),
          intArrayOf(1, 1, 1, 1, 1),
        )
      )
    )
  }
}
