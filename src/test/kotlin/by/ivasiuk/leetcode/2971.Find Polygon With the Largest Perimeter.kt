package by.ivasiuk.leetcode

import kotlin.test.Test
import kotlin.test.assertEquals

class FindPolygonWithTheLargestPerimeterTest {
  private val solution = FindPolygonWithTheLargestPerimeter()

  @Test
  fun example1() {
    assertEquals(
      expected = 15,
      actual = solution.largestPerimeter(
        nums = intArrayOf(5, 5, 5),
      )
    )
  }

  @Test
  fun example2() {
    assertEquals(
      expected = 12,
      actual = solution.largestPerimeter(
        nums = intArrayOf(1, 12, 1, 2, 5, 50, 3),
      )
    )
  }

  @Test
  fun example3() {
    assertEquals(
      expected = -1,
      actual = solution.largestPerimeter(
        nums = intArrayOf(5, 5, 50),
      )
    )
  }
}
