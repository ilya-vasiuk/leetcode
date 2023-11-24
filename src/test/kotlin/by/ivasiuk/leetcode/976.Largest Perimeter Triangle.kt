package by.ivasiuk.leetcode

import kotlin.test.Test
import kotlin.test.assertEquals

class LargestPerimeterTriangleTest {
  private val solution = LargestPerimeterTriangle()

  @Test
  fun example1() {
    val result = solution.largestPerimeter(intArrayOf(2, 1, 2))
    assertEquals(5, result)
  }

  @Test
  fun example2() {
    val result = solution.largestPerimeter(intArrayOf(1, 2, 1))
    assertEquals(0, result)
  }
}