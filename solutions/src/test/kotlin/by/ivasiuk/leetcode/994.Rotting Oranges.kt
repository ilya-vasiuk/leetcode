package by.ivasiuk.leetcode

import kotlin.test.Test
import kotlin.test.assertEquals

class RottingOrangesTest {
  private val solution = RottingOranges()

  @Test
  fun example1() {
    val grid = arrayOf(
      intArrayOf(2, 1, 1),
      intArrayOf(1, 1, 0),
      intArrayOf(0, 1, 1),
    )

    assertEquals(4, solution.orangesRotting(grid))
  }

  @Test
  fun example2() {
    val grid = arrayOf(
      intArrayOf(2, 1, 1),
      intArrayOf(1, 1, 0),
      intArrayOf(1, 0, 1),
    )

    assertEquals(-1, solution.orangesRotting(grid))
  }

  @Test
  fun example3() {
    val grid = arrayOf(
      intArrayOf(0, 2),
    )

    assertEquals(0, solution.orangesRotting(grid))
  }
}