package by.ivasiuk.leetcode

import kotlin.test.Test
import kotlin.test.assertEquals

class SearchInRotatedSortedArrayTest {
  private val solution = SearchInRotatedSortedArray()

  @Test
  fun example1() {
    assertEquals(4, solution.search(intArrayOf(4,5,6,7,0,1,2), 0))
  }

  @Test
  fun example2() {
    assertEquals(-1, solution.search(intArrayOf(4,5,6,7,0,1,2), 3))
  }

  @Test
  fun example3() {
    assertEquals(-1, solution.search(intArrayOf(1), 0))
  }
}