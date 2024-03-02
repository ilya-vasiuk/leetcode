package by.ivasiuk.leetcode

import kotlin.test.Test
import kotlin.test.assertEquals

class MaximumOddBinaryNumberTest {
  private val solution = MaximumOddBinaryNumber()

  @Test
  fun example1() {
    assertEquals(
      expected = "001",
      actual = solution.maximumOddBinaryNumber(
        s = "010"
      )
    )
  }

  @Test
  fun example2() {
    assertEquals(
      expected = "1001",
      actual = solution.maximumOddBinaryNumber(
        s = "0101"
      )
    )
  }
}
