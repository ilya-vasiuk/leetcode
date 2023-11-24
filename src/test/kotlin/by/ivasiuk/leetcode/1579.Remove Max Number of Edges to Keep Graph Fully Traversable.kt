package by.ivasiuk.leetcode

import kotlin.test.Test
import kotlin.test.assertEquals

class RemoveMaxNumberOfEdgesToKeepGraphFullyTraversableTest {
  private val solution = RemoveMaxNumberOfEdgesToKeepGraphFullyTraversable()

  @Test
  fun example1() {
    assertEquals(
      expected = 2,
      actual = solution.maxNumEdgesToRemove(
        n = 4,
        edges = arrayOf(
          intArrayOf(3, 1, 2),
          intArrayOf(3, 2, 3),
          intArrayOf(1, 1, 3),
          intArrayOf(1, 2, 4),
          intArrayOf(1, 1, 2),
          intArrayOf(2, 3, 4),
        )
      )
    )
  }

  @Test
  fun example2() {
    assertEquals(
      expected = 0,
      actual = solution.maxNumEdgesToRemove(
        n = 4,
        edges = arrayOf(
          intArrayOf(3, 1, 2),
          intArrayOf(3, 2, 3),
          intArrayOf(1, 1, 4),
          intArrayOf(2, 1, 4),
        )
      )
    )
  }

  @Test
  fun example3() {
    assertEquals(
      expected = -1,
      actual = solution.maxNumEdgesToRemove(
        n = 4,
        edges = arrayOf(
          intArrayOf(3, 2, 3),
          intArrayOf(1, 1, 2),
          intArrayOf(2, 3, 4),
        )
      )
    )
  }

  @Test
  fun example4() {
    assertEquals(
      expected = 2,
      actual = solution.maxNumEdgesToRemove(
        n = 2,
        edges = arrayOf(
          intArrayOf(1, 1, 2),
          intArrayOf(2, 1, 2),
          intArrayOf(3, 1, 2),
        )
      )
    )
  }
}
