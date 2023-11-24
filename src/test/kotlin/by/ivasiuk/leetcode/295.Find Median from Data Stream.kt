package by.ivasiuk.leetcode

import kotlin.test.Test
import kotlin.test.assertEquals

class MedianFinderTest {
  @Test
  fun example1() {
    val solution = MedianFinder()

    solution.addNum(1)
    solution.addNum(2)
    assertEquals(1.5, solution.findMedian())
    solution.addNum(3)
    assertEquals(2.0, solution.findMedian())
  }
}