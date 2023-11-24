package by.ivasiuk.leetcode

import kotlin.test.Test
import kotlin.test.assertEquals

class TallestBillboardTest {
  private val solution = TallestBillboard()

  @Test
  fun example1() {
    assertEquals(
      expected = 6,
      actual = solution.tallestBillboard(
        rods = intArrayOf(1, 2, 3, 6)
      )
    )
  }

  @Test
  fun example2() {
    assertEquals(
      expected = 10,
      actual = solution.tallestBillboard(
        rods = intArrayOf(1, 2, 3, 4, 5, 6)
      )
    )
  }

  @Test
  fun example3() {
    assertEquals(
      expected = 0,
      actual = solution.tallestBillboard(
        rods = intArrayOf(1, 2)
      )
    )
  }
}
