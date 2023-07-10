package by.ivasiuk.leetcode

import kotlin.test.Test
import kotlin.test.assertEquals

class SubstringWithLargestVarianceTest {
  private val solution = SubstringWithLargestVariance()

  @Test
  fun example1() {
    assertEquals(
      expected = 3,
      actual = solution.largestVariance(
        s = "aababbb"
      )
    )
  }

  @Test
  fun example2() {
    assertEquals(
      expected = 0,
      actual = solution.largestVariance(
        s = "abcde"
      )
    )
  }
}
