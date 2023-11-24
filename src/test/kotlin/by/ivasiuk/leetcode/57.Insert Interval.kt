package by.ivasiuk.leetcode

import by.ivasiuk.leetcode.common.assertInnerCollectionsContentEquals
import kotlin.test.Test

class InsertIntervalTest {
  private val solution = InsertInterval()

  @Test
  fun example1() {
    assertInnerCollectionsContentEquals(
      expected = arrayOf(
        intArrayOf(1, 5),
        intArrayOf(6, 9),
      ),
      actual = solution.insert(
        intervals = arrayOf(
          intArrayOf(1, 3),
          intArrayOf(6, 9),
        ),
        newInterval = intArrayOf(2, 5)
      )
    )
  }

  @Test
  fun example2() {
    assertInnerCollectionsContentEquals(
      expected = arrayOf(
        intArrayOf(1, 2),
        intArrayOf(3, 10),
        intArrayOf(12, 16),
      ),
      actual = solution.insert(
        intervals = arrayOf(
          intArrayOf(1, 2),
          intArrayOf(3, 5),
          intArrayOf(6, 7),
          intArrayOf(8, 10),
          intArrayOf(12, 16),
        ),
        newInterval = intArrayOf(4, 8)
      )
    )
  }
}