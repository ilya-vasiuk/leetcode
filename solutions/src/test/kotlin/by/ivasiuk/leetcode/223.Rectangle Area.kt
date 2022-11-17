package by.ivasiuk.leetcode

import kotlin.test.Test
import kotlin.test.assertEquals

class RectangleAreaTest {
  private val solution = RectangleArea()

  @Test
  fun example1() {
    assertEquals(
      expected = 45,
      actual = solution.computeArea(
        ax1 = -3,
        ay1 = 0,
        ax2 = 3,
        ay2 = 4,
        bx1 = 0,
        by1 = -1,
        bx2 = 9,
        by2 = 2
      )
    )
  }

  @Test
  fun example2() {
    assertEquals(
      expected = 16,
      actual = solution.computeArea(
        ax1 = -2,
        ay1 = -2,
        ax2 = 2,
        ay2 = 2,
        bx1 = -2,
        by1 = -2,
        bx2 = 2,
        by2 = 2
      )
    )
  }

  @Test
  fun example3() {
    assertEquals(
      expected = 24,
      actual = solution.computeArea(
        ax1 = -3,
        ay1 = -3,
        ax2 = 3,
        ay2 = -1,
        bx1 = -2,
        by1 = -2,
        bx2 = 2,
        by2 = 2
      )
    )
  }
}
