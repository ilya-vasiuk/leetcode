package by.ivasiuk.leetcode

import kotlin.test.Test
import kotlin.test.assertEquals

class IPOTest {
  private val solution = IPO()

  @Test
  fun example1() {
    assertEquals(
      expected = 4,
      actual = solution.findMaximizedCapital(
        k = 2,
        w = 0,
        profits = intArrayOf(1, 2, 3),
        capital = intArrayOf(0, 1, 1)
      )
    )
  }

  @Test
  fun example2() {
    assertEquals(
      expected = 6,
      actual = solution.findMaximizedCapital(
        k = 3,
        w = 0,
        profits = intArrayOf(1, 2, 3),
        capital = intArrayOf(0, 1, 2)
      )
    )
  }
}
