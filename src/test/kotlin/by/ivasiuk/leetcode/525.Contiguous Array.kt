package by.ivasiuk.leetcode

import kotlin.test.Test
import kotlin.test.assertEquals

class ContiguousArrayTest {
  private val solution = ContiguousArray()

  @Test
  fun example1() {
    assertEquals(
      expected = 2,
      actual = solution.findMaxLength(
        nums = intArrayOf(0, 1)
      )
    )
  }

  @Test
  fun example2() {
    assertEquals(
      expected = 2,
      actual = solution.findMaxLength(
        nums = intArrayOf(0, 1, 0)
      )
    )
  }
}
