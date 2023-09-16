package by.ivasiuk.leetcode

import kotlin.test.Test
import kotlin.test.assertEquals

class PathWithMinimumEffortTest {
  private val solution = PathWithMinimumEffort()

  @Test
  fun example1() {
    assertEquals(
      expected = 2,
      actual = solution.minimumEffortPath(
        heights = arrayOf(
          intArrayOf(1, 2, 2),
          intArrayOf(3, 8, 2),
          intArrayOf(5, 3, 5),
        )
      )
    )
  }

  @Test
  fun example2() {
    assertEquals(
      expected = 1,
      actual = solution.minimumEffortPath(
        heights = arrayOf(
          intArrayOf(1, 2, 3),
          intArrayOf(3, 8, 4),
          intArrayOf(5, 3, 5),
        )
      )
    )
  }

  @Test
  fun example3() {
    assertEquals(
      expected = 0,
      actual = solution.minimumEffortPath(
        heights = arrayOf(
          intArrayOf(1, 2, 1, 1, 1),
          intArrayOf(1, 2, 1, 2, 1),
          intArrayOf(1, 2, 1, 2, 1),
          intArrayOf(1, 2, 1, 2, 1),
          intArrayOf(1, 1, 1, 2, 1),
        )
      )
    )
  }
}
