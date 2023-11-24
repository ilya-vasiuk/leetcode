package by.ivasiuk.leetcode

import kotlin.test.Test
import kotlin.test.assertEquals

class NthTribonacciNumberTest {
  private val solution = NthTribonacciNumber()

  @Test
  fun example1() {
    assertEquals(
      expected = 4,
      actual = solution.tribonacci(4)
    )
  }

  @Test
  fun example2() {
    assertEquals(
      expected = 1389537,
      actual = solution.tribonacci(25)
    )
  }

  @Test
  fun example3() {
    assertEquals(
      expected = 0,
      actual = solution.tribonacci(0)
    )
  }
}
