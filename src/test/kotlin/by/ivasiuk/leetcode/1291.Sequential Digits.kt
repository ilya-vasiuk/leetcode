package by.ivasiuk.leetcode

import kotlin.test.Test
import kotlin.test.assertContentEquals

class SequentialDigitsTest {
  private val solution = SequentialDigits()

  @Test
  fun example1() {
    assertContentEquals(
      expected = listOf(123, 234),
      actual = solution.sequentialDigits(
        low = 100,
        high = 300,
      )
    )
  }

  @Test
  fun example2() {
    assertContentEquals(
      expected = listOf(1234,2345,3456,4567,5678,6789,12345),
      actual = solution.sequentialDigits(
        low = 1000,
        high = 13000,
      )
    )
  }
}
