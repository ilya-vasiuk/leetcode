package by.ivasiuk.leetcode

import kotlin.test.Test
import kotlin.test.assertContentEquals
import kotlin.test.assertEquals

class SummaryRangesTest {
  @Test
  fun example1() {
    val solution = SummaryRanges()

    solution.addNum(1)
    assertArraysContentEquals(
      expected = arrayOf(intArrayOf(1, 1)),
      actual = solution.getIntervals()
    )

    solution.addNum(3)
    assertArraysContentEquals(
      expected = arrayOf(
        intArrayOf(1, 1),
        intArrayOf(3, 3),
      ),
      actual = solution.getIntervals()
    )

    solution.addNum(7)
    assertArraysContentEquals(
      expected = arrayOf(
        intArrayOf(1, 1),
        intArrayOf(3, 3),
        intArrayOf(7, 7),
      ),
      actual = solution.getIntervals()
    )

    solution.addNum(2)
    assertArraysContentEquals(
      expected = arrayOf(
        intArrayOf(1, 3),
        intArrayOf(7, 7),
      ),
      actual = solution.getIntervals()
    )

    solution.addNum(6)
    assertArraysContentEquals(
      expected = arrayOf(
        intArrayOf(1, 3),
        intArrayOf(6, 7),
      ),
      actual = solution.getIntervals()
    )
  }

  companion object {
    private fun assertArraysContentEquals(
      actual: Array<IntArray>,
      expected: Array<IntArray>,
    ) {
      assertEquals(actual.size, expected.size)
      for (i in expected.indices) {
        assertContentEquals(expected[i], actual[i])
      }
    }
  }
}
