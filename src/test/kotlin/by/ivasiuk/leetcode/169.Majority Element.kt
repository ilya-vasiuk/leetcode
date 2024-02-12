package by.ivasiuk.leetcode

import kotlin.test.Test
import kotlin.test.assertEquals

class MajorityElementTest {
  private val solution = MajorityElement()

  @Test
  fun example1() {
    assertEquals(
      expected = 3,
      actual = solution.majorityElement(
        nums = intArrayOf(3, 2, 3)
      )
    )
  }

  @Test
  fun example2() {
    assertEquals(
      expected = 2,
      actual = solution.majorityElement(
        nums = intArrayOf(2, 2, 1, 1, 1, 2, 2)
      )
    )
  }
}
