package by.ivasiuk.leetcode

import kotlin.test.Test
import kotlin.test.assertEquals

class LargestOddNumberInStringTest {
  private val solution = LargestOddNumberInString()

  @Test
  fun example1() {
    assertEquals(
      expected = "5",
      actual = solution.largestOddNumber(
        num = "52"
      )
    )
  }

  @Test
  fun example2() {
    assertEquals(
      expected = "",
      actual = solution.largestOddNumber(
        num = "4206"
      )
    )
  }

  @Test
  fun example3() {
    assertEquals(
      expected = "35427",
      actual = solution.largestOddNumber(
        num = "35427"
      )
    )
  }
}
