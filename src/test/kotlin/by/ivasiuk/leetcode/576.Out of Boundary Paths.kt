package by.ivasiuk.leetcode

import kotlin.test.Test
import kotlin.test.assertEquals

class OutOfBoundaryPathsTest {
  private val solution = OutOfBoundaryPaths()

  @Test
  fun example1() {
    assertEquals(
      expected = 6,
      actual = solution.findPaths(
        m = 2,
        n = 2,
        maxMove = 2,
        startRow = 0,
        startColumn = 0,
      )
    )
  }

  @Test
  fun example2() {
    assertEquals(
      expected = 12,
      actual = solution.findPaths(
        m = 1,
        n = 3,
        maxMove = 3,
        startRow = 0,
        startColumn = 1,
      )
    )
  }
}
