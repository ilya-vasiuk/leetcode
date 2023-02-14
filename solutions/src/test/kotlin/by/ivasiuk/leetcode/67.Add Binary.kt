package by.ivasiuk.leetcode

import kotlin.test.Test
import kotlin.test.assertEquals

class AddBinaryTest {
  private val solution = AddBinary()

  @Test
  fun example1() {
    assertEquals(
      expected = "100",
      actual = solution.addBinary(
        a = "11",
        b = "1",
      )
    )
  }

  @Test
  fun example2() {
    assertEquals(
      expected = "10101",
      actual = solution.addBinary(
        a = "1010",
        b = "1011",
      )
    )
  }
}
