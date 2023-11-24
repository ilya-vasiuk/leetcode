package by.ivasiuk.leetcode

import kotlin.test.Test
import kotlin.test.assertEquals

class JumpGame2Test {
  private val solution = JumpGame2()

  @Test
  fun example1() {
    assertEquals(
      expected = 2,
      actual = solution.jump(
        nums = intArrayOf(2, 3, 1, 1, 4)
      )
    )
  }

  @Test
  fun example2() {
    assertEquals(
      expected = 2,
      actual = solution.jump(
        nums = intArrayOf(2, 3, 0, 1, 4)
      )
    )
  }
}