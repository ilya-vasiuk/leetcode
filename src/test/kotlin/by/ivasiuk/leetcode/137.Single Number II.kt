package by.ivasiuk.leetcode

import kotlin.test.Test
import kotlin.test.assertEquals

class SingleNumber2Test {
  private val solution = SingleNumber2()

  @Test
  fun example1() {
    assertEquals(
      expected = 3,
      actual = solution.singleNumber(
        nums = intArrayOf(2, 2, 3, 2)
      )
    )
  }

  @Test
  fun example2() {
    assertEquals(
      expected = 99,
      actual = solution.singleNumber(
        nums = intArrayOf(0, 1, 0, 1, 0, 1, 99)
      )
    )
  }
}
