package by.ivasiuk.leetcode

import kotlin.test.Test
import kotlin.test.assertEquals

class NearestExitFromEntranceInMazeTest {
  private val solution = NearestExitFromEntranceInMaze()

  @Test
  fun example1() {
    assertEquals(
      expected = 1,
      actual = solution.nearestExit(
        maze = arrayOf(
          charArrayOf('+', '+', '.', '+'),
          charArrayOf('.', '.', '.', '+'),
          charArrayOf('+', '+', '+', '.'),
        ),
        entrance = intArrayOf(1, 2)
      )
    )
  }

  @Test
  fun example2() {
    assertEquals(
      expected = 2,
      actual = solution.nearestExit(
        maze = arrayOf(
          charArrayOf('+', '+', '+'),
          charArrayOf('.', '.', '.'),
          charArrayOf('+', '+', '+'),
        ),
        entrance = intArrayOf(1, 0)
      )
    )
  }

  @Test
  fun example3() {
    assertEquals(
      expected = -1,
      actual = solution.nearestExit(
        maze = arrayOf(
          charArrayOf('.', '+'),
        ),
        entrance = intArrayOf(0, 0)
      )
    )
  }
}
