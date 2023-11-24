package by.ivasiuk.leetcode

import kotlin.test.Test
import kotlin.test.assertEquals

class FindUniqueBinaryStringTest {
  private val solution = FindUniqueBinaryString()

  @Test
  fun example1() {
    assertEquals(
      expected = "11",
      actual = solution.findDifferentBinaryString(
        nums = arrayOf("01", "10"),
      )
    )
  }

  @Test
  fun example2() {
    assertEquals(
      expected = "10",
      actual = solution.findDifferentBinaryString(
        nums = arrayOf("00", "01"),
      )
    )
  }

  @Test
  fun example3() {
    assertEquals(
      expected = "000",
      actual = solution.findDifferentBinaryString(
        nums = arrayOf("111", "011", "001"),
      )
    )
  }
}
