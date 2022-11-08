package by.ivasiuk.leetcode

import kotlin.test.Test
import kotlin.test.assertEquals

class BitwiseAndOfNumbersRangeTest {
  private val solution = BitwiseAndOfNumbersRange()

  @Test
  fun example1() {
    assertEquals(
      expected = 4,
      actual = solution.rangeBitwiseAnd(
        left = 5,
        right = 7,
      )
    )
  }

  @Test
  fun example2() {
    assertEquals(
      expected = 0,
      actual = solution.rangeBitwiseAnd(
        left = 0,
        right = 0,
      )
    )
  }

  @Test
  fun example3() {
    assertEquals(
      expected = 0,
      actual = solution.rangeBitwiseAnd(
        left = 1,
        right = 2147483647,
      )
    )
  }
}