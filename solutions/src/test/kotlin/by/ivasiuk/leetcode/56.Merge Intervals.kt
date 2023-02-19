package by.ivasiuk.leetcode

import by.ivasiuk.leetcode.common.assertInnerCollectionsContentEquals
import kotlin.test.Test

class MergeIntervalsTest {
  private val solution = MergeIntervals()

  @Test
  fun example1() {
    assertInnerCollectionsContentEquals(
      expected = arrayOf(
        intArrayOf(1, 6),
        intArrayOf(8, 10),
        intArrayOf(15, 18),
      ),
      actual = solution.merge(
        intervals = arrayOf(
          intArrayOf(1, 3),
          intArrayOf(2, 6),
          intArrayOf(8, 10),
          intArrayOf(15, 18),
        )
      )
    )
  }

  @Test
  fun example2() {
    assertInnerCollectionsContentEquals(
      expected = arrayOf(
        intArrayOf(1, 5),
      ),
      actual = solution.merge(
        intervals = arrayOf(
          intArrayOf(1, 4),
          intArrayOf(4, 5),
        )
      )
    )
  }
}
