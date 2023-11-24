package by.ivasiuk.leetcode

import kotlin.test.Test
import kotlin.test.assertEquals

class FindMinimumInRotatedSortedArrayTest {
  private val solution = FindMinimumInRotatedSortedArray()

  @Test
  fun example1() {
    assertEquals(1, solution.findMin(intArrayOf(3,4,5,1,2)))
  }

  @Test
  fun example2() {
    assertEquals(0, solution.findMin(intArrayOf(4,5,6,7,0,1,2)))
  }

  @Test
  fun example3() {
    assertEquals(11, solution.findMin(intArrayOf(11,13,15,17)))
  }
}