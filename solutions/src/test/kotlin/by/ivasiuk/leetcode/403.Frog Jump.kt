package by.ivasiuk.leetcode

import kotlin.test.Test
import kotlin.test.assertFalse
import kotlin.test.assertTrue

class FrogJumpTest {
  private val solution = FrogJump()

  @Test
  fun example1() {
    assertTrue {
      solution.canCross(
        stones = intArrayOf(0, 1, 3, 5, 6, 8, 12, 17)
      )
    }
  }

  @Test
  fun example2() {
    assertFalse {
      solution.canCross(
        stones = intArrayOf(0,1,2,3,4,8,9,11)
      )
    }
  }
}
