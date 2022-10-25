package by.ivasiuk.leetcode

import kotlin.test.Test
import kotlin.test.assertContentEquals

class FindFirstAndLastPositionOfElementInSortedArrayTest {
  private val solution = FindFirstAndLastPositionOfElementInSortedArray()

  @Test
  fun example1() {
    val result = solution.searchRange(intArrayOf(5, 7, 7, 8, 8, 10), 8)

    assertContentEquals(intArrayOf(3, 4), result)
  }

  @Test
  fun example2() {
    val result = solution.searchRange(intArrayOf(5, 7, 7, 8, 8, 10), 6)

    assertContentEquals(intArrayOf(-1, -1), result)
  }

  @Test
  fun example3() {
    val result = solution.searchRange(intArrayOf(), 0)

    assertContentEquals(intArrayOf(-1, -1), result)
  }
}