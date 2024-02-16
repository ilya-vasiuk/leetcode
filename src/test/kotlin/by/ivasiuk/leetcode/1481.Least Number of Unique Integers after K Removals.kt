package by.ivasiuk.leetcode

import kotlin.test.Test
import kotlin.test.assertEquals

class LeastNumberOfUniqueIntegersAfterKRemovalsTest {
  private val solution = LeastNumberOfUniqueIntegersAfterKRemovals()

  @Test
  fun example1() {
    assertEquals(
      expected = 1,
      actual = solution.findLeastNumOfUniqueInts(
        arr = intArrayOf(5, 5, 4),
        k = 1,
      )
    )
  }

  @Test
  fun example2() {
    assertEquals(
      expected = 2,
      actual = solution.findLeastNumOfUniqueInts(
        arr = intArrayOf(4, 3, 1, 1, 3, 3, 2),
        k = 3,
      )
    )
  }
}
