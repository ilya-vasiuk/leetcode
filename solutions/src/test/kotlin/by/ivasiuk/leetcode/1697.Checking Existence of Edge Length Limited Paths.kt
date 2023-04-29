package by.ivasiuk.leetcode

import kotlin.test.Test
import kotlin.test.assertContentEquals

class CheckingExistenceOfEdgeLengthLimitedPathsTest {
  private val solution = CheckingExistenceOfEdgeLengthLimitedPaths()

  @Test
  fun example1() {
    assertContentEquals(
      expected = booleanArrayOf(false, true),
      actual = solution.distanceLimitedPathsExist(
        n = 3,
        edgeList = arrayOf(
          intArrayOf(0, 1, 2),
          intArrayOf(1, 2, 4),
          intArrayOf(2, 0, 8),
          intArrayOf(1, 0, 16),
        ),
        queries = arrayOf(
          intArrayOf(0, 1, 2),
          intArrayOf(0, 2, 5)
        )
      )
    )
  }

  @Test
  fun example2() {
    assertContentEquals(
      expected = booleanArrayOf(true, false),
      actual = solution.distanceLimitedPathsExist(
        n = 5,
        edgeList = arrayOf(
          intArrayOf(0, 1, 10),
          intArrayOf(1, 2, 5),
          intArrayOf(2, 3, 9),
          intArrayOf(3, 4, 13),
        ),
        queries = arrayOf(
          intArrayOf(0, 4, 14),
          intArrayOf(1, 4, 13)
        )
      )
    )
  }
}
