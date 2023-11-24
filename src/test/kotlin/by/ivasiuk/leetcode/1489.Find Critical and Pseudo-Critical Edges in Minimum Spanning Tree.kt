package by.ivasiuk.leetcode

import by.ivasiuk.leetcode.common.assertInnerCollectionsContentEquals
import kotlin.test.Test

class FindCriticalAndPseudoCriticalEdgesInMinimumSpanningTreeTest {
  private val solution = FindCriticalAndPseudoCriticalEdgesInMinimumSpanningTree()

  @Test
  fun example1() {
    assertInnerCollectionsContentEquals(
      expected = listOf(
        listOf(0, 1),
        listOf(2, 3, 4, 5)
      ),
      actual = solution.findCriticalAndPseudoCriticalEdges(
        n = 5,
        edges = arrayOf(
          intArrayOf(0, 1, 1),
          intArrayOf(1, 2, 1),
          intArrayOf(2, 3, 2),
          intArrayOf(0, 3, 2),
          intArrayOf(0, 4, 3),
          intArrayOf(3, 4, 3),
          intArrayOf(1, 4, 6),
        )
      )
    )
  }

  @Test
  fun example2() {
    assertInnerCollectionsContentEquals(
      expected = listOf(
        emptyList(),
        listOf(0, 1, 2, 3)
      ),
      actual = solution.findCriticalAndPseudoCriticalEdges(
        n = 4,
        edges = arrayOf(
          intArrayOf(0, 1, 1),
          intArrayOf(1, 2, 1),
          intArrayOf(2, 3, 1),
          intArrayOf(0, 3, 1),
        )
      )
    )
  }
}
