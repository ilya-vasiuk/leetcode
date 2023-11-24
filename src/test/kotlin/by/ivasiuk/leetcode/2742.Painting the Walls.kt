package by.ivasiuk.leetcode

import kotlin.test.Test
import kotlin.test.assertEquals

class PaintingTheWallsTest {
  private val solution = PaintingTheWalls()

  @Test
  fun example1() {
    assertEquals(
      expected = 3,
      actual = solution.paintWalls(
        cost = intArrayOf(1, 2, 3, 2),
        time = intArrayOf(1, 2, 3, 2)
      )
    )
  }

  @Test
  fun example2() {
    assertEquals(
      expected = 4,
      actual = solution.paintWalls(
        cost = intArrayOf(2, 3, 4, 2),
        time = intArrayOf(1, 1, 1, 1)
      )
    )
  }
}
