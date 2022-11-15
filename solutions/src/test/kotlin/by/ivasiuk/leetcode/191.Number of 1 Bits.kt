package by.ivasiuk.leetcode

import kotlin.test.Test
import kotlin.test.assertEquals

class NumberOf1BitsTest {
  private val solution = NumberOf1Bits()

  @Test
  fun example1() {
    assertEquals(
      expected = 3,
      actual = solution.hammingWeight(
        n = 0b00000000000000000000000000001011
      )
    )
  }

  @Test
  fun example2() {
    assertEquals(
      expected = 1,
      actual = solution.hammingWeight(
        n = 0b00000000000000000000000010000000
      )
    )
  }

  @Test
  fun example3() {
    assertEquals(
      expected = 31,
      actual = solution.hammingWeight(
        n = -3
      )
    )
  }
}