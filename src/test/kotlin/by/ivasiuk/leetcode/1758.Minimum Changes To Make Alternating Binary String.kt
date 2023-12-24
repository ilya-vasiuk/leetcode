package by.ivasiuk.leetcode

import kotlin.test.Test
import kotlin.test.assertEquals

class MinimumChangesToMakeAlternatingBinaryStringTest {
  private val solution = MinimumChangesToMakeAlternatingBinaryString()

  @Test
  fun example1() {
    assertEquals(
      expected = 1,
      actual = solution.minOperations(
        s = "0100"
      )
    )
  }

  @Test
  fun example2() {
    assertEquals(
      expected = 0,
      actual = solution.minOperations(
        s = "10"
      )
    )
  }

  @Test
  fun example3() {
    assertEquals(
      expected = 2,
      actual = solution.minOperations(
        s = "1111"
      )
    )
  }
}
