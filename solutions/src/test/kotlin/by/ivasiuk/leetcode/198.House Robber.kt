package by.ivasiuk.leetcode

import kotlin.test.Test
import kotlin.test.assertEquals

class HouseRobberTest {
  private val solution = HouseRobber()

  @Test
  fun example1() {
    assertEquals(
      expected = 4,
      actual = solution.rob(
        nums = intArrayOf(1, 2, 3, 1)
      )
    )
  }

  @Test
  fun example2() {
    assertEquals(
      expected = 12,
      actual = solution.rob(
        nums = intArrayOf(2, 7, 9, 3, 1)
      )
    )
  }
}