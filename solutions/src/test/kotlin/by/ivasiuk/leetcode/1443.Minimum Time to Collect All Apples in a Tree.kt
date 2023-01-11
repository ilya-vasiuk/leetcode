package by.ivasiuk.leetcode

import kotlin.test.Test
import kotlin.test.assertEquals

class MinimumTimeToCollectAllApplesInATreeTest {
  private val solution = MinimumTimeToCollectAllApplesInATree()

  @Test
  fun example1() {
    assertEquals(
      expected = 8,
      actual = solution.minTime(
        n = 7,
        edges = arrayOf(
          intArrayOf(0, 1),
          intArrayOf(0, 2),
          intArrayOf(1, 4),
          intArrayOf(1, 5),
          intArrayOf(2, 3),
          intArrayOf(2, 6),
        ),
        hasApple = listOf(false, false, true, false, true, true, false)
      )
    )
  }

  @Test
  fun example2() {
    assertEquals(
      expected = 6,
      actual = solution.minTime(
        n = 7,
        edges = arrayOf(
          intArrayOf(0, 1),
          intArrayOf(0, 2),
          intArrayOf(1, 4),
          intArrayOf(1, 5),
          intArrayOf(2, 3),
          intArrayOf(2, 6),
        ),
        hasApple = listOf(false, false, true, false, false, true, false)
      )
    )
  }

  @Test
  fun example3() {
    assertEquals(
      expected = 0,
      actual = solution.minTime(
        n = 7,
        edges = arrayOf(
          intArrayOf(0, 1),
          intArrayOf(0, 2),
          intArrayOf(1, 4),
          intArrayOf(1, 5),
          intArrayOf(2, 3),
          intArrayOf(2, 6),
        ),
        hasApple = listOf(false, false, false, false, false, false, false)
      )
    )
  }

  @Test
  fun example4() {
    assertEquals(
      expected = 4,
      actual = solution.minTime(
        n = 4,
        edges = arrayOf(
          intArrayOf(0, 2),
          intArrayOf(0, 3),
          intArrayOf(1, 2),
        ),
        hasApple = listOf(false, true, false, false)
      )
    )
  }
}
