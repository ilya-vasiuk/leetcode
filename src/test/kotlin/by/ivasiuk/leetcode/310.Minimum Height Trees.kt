package by.ivasiuk.leetcode

import kotlin.test.Test
import kotlin.test.assertContentEquals

class MinimumHeightTreesTest {
  private val solution = MinimumHeightTrees()

  @Test
  fun example1() {
    assertContentEquals(
      expected = listOf(1),
      actual = solution.findMinHeightTrees(
        n = 4,
        edges = arrayOf(
          intArrayOf(1, 0),
          intArrayOf(1, 2),
          intArrayOf(1, 3),
        )
      )
    )
  }

  @Test
  fun example2() {
    assertContentEquals(
      expected = listOf(3, 4),
      actual = solution.findMinHeightTrees(
        n = 6,
        edges = arrayOf(
          intArrayOf(3, 0),
          intArrayOf(3, 1),
          intArrayOf(3, 2),
          intArrayOf(3, 4),
          intArrayOf(5, 4),
        )
      )
    )
  }
}
