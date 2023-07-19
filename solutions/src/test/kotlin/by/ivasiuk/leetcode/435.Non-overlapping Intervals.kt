package by.ivasiuk.leetcode

import kotlin.test.Test
import kotlin.test.assertEquals

class NonOverlappingIntervalsTest {
  private val solution = NonOverlappingIntervals()

  @Test
  fun example1() {
    assertEquals(
      expected = 1,
      actual = solution.eraseOverlapIntervals(
        intervals = arrayOf(
          intArrayOf(1, 2),
          intArrayOf(2, 3),
          intArrayOf(3, 4),
          intArrayOf(1, 3),
        )
      )
    )
  }

  @Test
  fun example2() {
    assertEquals(
      expected = 2,
      actual = solution.eraseOverlapIntervals(
        intervals = arrayOf(
          intArrayOf(1, 2),
          intArrayOf(1, 2),
          intArrayOf(1, 2),
        )
      )
    )
  }

  @Test
  fun example3() {
    assertEquals(
      expected = 0,
      actual = solution.eraseOverlapIntervals(
        intervals = arrayOf(
          intArrayOf(1, 2),
          intArrayOf(2, 3),
        )
      )
    )
  }
}
