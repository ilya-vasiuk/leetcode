package by.ivasiuk.leetcode

import kotlin.test.Test
import kotlin.test.assertEquals

class BinarySearchTest {
  private val solution = BinarySearch()

  @Test
  fun example1() {
    assertEquals(
      expected = 4,
      actual = solution.search(
        nums = intArrayOf(-1, 0, 3, 5, 9, 12),
        target = 9,
      )
    )
  }

  @Test
  fun example2() {
    assertEquals(
      expected = -1,
      actual = solution.search(
        nums = intArrayOf(-1, 0, 3, 5, 9, 12),
        target = 2,
      )
    )
  }
}
