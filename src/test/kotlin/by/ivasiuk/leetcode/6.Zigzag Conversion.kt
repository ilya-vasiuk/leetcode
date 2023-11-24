package by.ivasiuk.leetcode

import kotlin.test.Test
import kotlin.test.assertEquals

class ZigzagConversionTest {
  private val solution = ZigzagConversion()

  @Test
  fun example1() {
    assertEquals(
      expected = "PAHNAPLSIIGYIR",
      actual = solution.convert(
        s = "PAYPALISHIRING",
        numRows = 3
      )
    )
  }

  @Test
  fun example2() {
    assertEquals(
      expected = "PINALSIGYAHRPI",
      actual = solution.convert(
        s = "PAYPALISHIRING",
        numRows = 4
      )
    )
  }

  @Test
  fun example3() {
    assertEquals(
      expected = "A",
      actual = solution.convert(
        s = "A",
        numRows = 1
      )
    )
  }
}
