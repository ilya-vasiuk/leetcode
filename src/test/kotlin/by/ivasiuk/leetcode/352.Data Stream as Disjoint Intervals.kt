package by.ivasiuk.leetcode

import by.ivasiuk.leetcode.common.assertInnerCollectionsContentEquals
import kotlin.test.Test

class DataStreamAsDisjointIntervalsTest {
  @Test
  fun example1() {
    val solution = DataStreamAsDisjointIntervals()

    solution.addNum(1)
    assertInnerCollectionsContentEquals(
      expected = arrayOf(intArrayOf(1, 1)),
      actual = solution.getIntervals()
    )

    solution.addNum(3)
    assertInnerCollectionsContentEquals(
      expected = arrayOf(
        intArrayOf(1, 1),
        intArrayOf(3, 3),
      ),
      actual = solution.getIntervals()
    )

    solution.addNum(7)
    assertInnerCollectionsContentEquals(
      expected = arrayOf(
        intArrayOf(1, 1),
        intArrayOf(3, 3),
        intArrayOf(7, 7),
      ),
      actual = solution.getIntervals()
    )

    solution.addNum(2)
    assertInnerCollectionsContentEquals(
      expected = arrayOf(
        intArrayOf(1, 3),
        intArrayOf(7, 7),
      ),
      actual = solution.getIntervals()
    )

    solution.addNum(6)
    assertInnerCollectionsContentEquals(
      expected = arrayOf(
        intArrayOf(1, 3),
        intArrayOf(6, 7),
      ),
      actual = solution.getIntervals()
    )
  }
}
