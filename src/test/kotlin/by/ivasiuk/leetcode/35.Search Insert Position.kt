package by.ivasiuk.leetcode

import kotlin.test.Test
import kotlin.test.assertEquals

class SearchInsertPositionTest {
  private val solution = SearchInsertPosition()

  @Test
  fun example1() {
    assertEquals(
      expected = 2,
      actual = solution.searchInsert(
        nums = intArrayOf(1, 3, 5, 6),
        target = 5,
      )
    )
  }

  @Test
  fun example2() {
    assertEquals(
      expected = 1,
      actual = solution.searchInsert(
        nums = intArrayOf(1, 3, 5, 6),
        target = 2,
      )
    )
  }

  @Test
  fun example3() {
    assertEquals(
      expected = 4,
      actual = solution.searchInsert(
        nums = intArrayOf(1, 3, 5, 6),
        target = 7,
      )
    )
  }
}
