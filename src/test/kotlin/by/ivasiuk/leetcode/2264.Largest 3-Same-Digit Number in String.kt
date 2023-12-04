package by.ivasiuk.leetcode

import kotlin.test.Test
import kotlin.test.assertEquals

class Largest3SameDigitNumberInStringTest {
  private val solution = Largest3SameDigitNumberInString()

  @Test
  fun example1() {
    assertEquals(
      expected = "777",
      actual = solution.largestGoodInteger(
        num = "6777133339"
      )
    )
  }

  @Test
  fun example2() {
    assertEquals(
      expected = "000",
      actual = solution.largestGoodInteger(
        num = "2300019"
      )
    )
  }

  @Test
  fun example3() {
    assertEquals(
      expected = "",
      actual = solution.largestGoodInteger(
        num = "42352338"
      )
    )
  }
}
