package by.ivasiuk.leetcode

import by.ivasiuk.leetcode.common.assertInnerCollectionsContentEquals
import kotlin.test.Test

class IntervalListIntersectionsTest {
  private val solution = IntervalListIntersections()

  @Test
  fun example1() {
    assertInnerCollectionsContentEquals(
      expected = arrayOf(
        intArrayOf(1, 2),
        intArrayOf(5, 5),
        intArrayOf(8, 10),
        intArrayOf(15, 23),
        intArrayOf(24, 24),
        intArrayOf(25, 25),
      ),
      actual = solution.intervalIntersection(
        firstList = arrayOf(
          intArrayOf(0, 2),
          intArrayOf(5, 10),
          intArrayOf(13, 23),
          intArrayOf(24, 25),
        ),
        secondList = arrayOf(
          intArrayOf(1, 5),
          intArrayOf(8, 12),
          intArrayOf(15, 24),
          intArrayOf(25, 26),
        )
      )
    )
  }

  @Test
  fun example2() {
    assertInnerCollectionsContentEquals(
      expected = emptyArray(),
      actual = solution.intervalIntersection(
        firstList = arrayOf(intArrayOf(1, 3)),
        secondList = arrayOf(intArrayOf(5, 9))
      )
    )
  }
}