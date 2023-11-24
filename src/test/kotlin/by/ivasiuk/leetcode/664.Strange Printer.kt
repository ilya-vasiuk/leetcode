package by.ivasiuk.leetcode

import kotlin.test.Test
import kotlin.test.assertEquals

class StrangePrinterTest {
  private val solution = StrangePrinter()

  @Test
  fun example1() {
    assertEquals(
      expected = 2,
      actual = solution.strangePrinter(
        s = "aaabbb"
      )
    )
  }

  @Test
  fun example2() {
    assertEquals(
      expected = 2,
      actual = solution.strangePrinter(
        s = "aba"
      )
    )
  }
}
