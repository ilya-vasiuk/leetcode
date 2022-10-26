package by.ivasiuk.leetcode

import kotlin.test.Test
import kotlin.test.assertEquals

class FindPeakElementTest {
  private val solution = FindPeakElement()

  @Test
  fun example1() {
    assertEquals(2, solution.findPeakElement(intArrayOf(1, 2, 3, 1)))
  }

  @Test
  fun example2() {
    assertEquals(5, solution.findPeakElement(intArrayOf(1, 2, 1, 3, 5, 6, 4)))
  }
}