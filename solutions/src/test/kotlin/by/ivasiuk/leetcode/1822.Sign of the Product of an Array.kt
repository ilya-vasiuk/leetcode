package by.ivasiuk.leetcode

import kotlin.test.Test
import kotlin.test.assertEquals

class SignOfTheProductOfAnArrayTest {
  private val solution = SignOfTheProductOfAnArray()

  @Test
  fun example1() {
    assertEquals(
      expected = 1,
      actual = solution.arraySign(
        nums = intArrayOf(-1, -2, -3, -4, 3, 2, 1)
      )
    )
  }

  @Test
  fun example2() {
    assertEquals(
      expected = 0,
      actual = solution.arraySign(
        nums = intArrayOf(1, 5, 0, 2, -3)
      )
    )
  }

  @Test
  fun example3() {
    assertEquals(
      expected = -1,
      actual = solution.arraySign(
        nums = intArrayOf(-1, 1, -1, 1, -1)
      )
    )
  }
}