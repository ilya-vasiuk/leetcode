package by.ivasiuk.leetcode

import kotlin.test.Test
import kotlin.test.assertEquals

class StockSpannerTest {
  @Test
  fun example1() {
    val solution = StockSpanner()

    assertEquals(1, solution.next(100))
    assertEquals(1, solution.next(80))
    assertEquals(1, solution.next(60))
    assertEquals(2, solution.next(70))
    assertEquals(1, solution.next(60))
    assertEquals(4, solution.next(75))
    assertEquals(6, solution.next(85))
  }
}
