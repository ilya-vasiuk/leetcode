package by.ivasiuk.leetcode

import kotlin.test.Test
import kotlin.test.assertEquals

class HouseRobber2Test {
  private val solution = HouseRobber2()

  @Test
  fun example1() {
    assertEquals(
      expected = 3,
      actual = solution.rob(
        nums = intArrayOf(2, 3, 2)
      )
    )
  }

  @Test
  fun example2() {
    assertEquals(
      expected = 4,
      actual = solution.rob(
        nums = intArrayOf(1,2,3,1)
      )
    )
  }

  @Test
  fun example3() {
    assertEquals(
      expected = 3,
      actual = solution.rob(
        nums = intArrayOf(1,2,3)
      )
    )
  }
}