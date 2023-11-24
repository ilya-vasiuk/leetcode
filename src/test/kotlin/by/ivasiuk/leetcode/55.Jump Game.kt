package by.ivasiuk.leetcode

import kotlin.test.Test
import kotlin.test.assertFalse
import kotlin.test.assertTrue

class JumpGameTest {
  private val solution = JumpGame()

  @Test
  fun example1() {
    assertTrue {
      solution.canJump(
        nums = intArrayOf(2, 3, 1, 1, 4)
      )
    }
  }

  @Test
  fun example2() {
    assertFalse {
      solution.canJump(
        nums = intArrayOf(3, 2, 1, 0, 4)
      )
    }
  }

  @Test
  fun example3() {
    assertTrue {
      solution.canJump(
        nums = intArrayOf(0)
      )
    }
  }

  @Test
  fun example4() {
    assertFalse {
      solution.canJump(
        nums = intArrayOf(0, 2, 3)
      )
    }
  }

  @Test
  fun example5() {
    assertTrue {
      solution.canJump(
        nums = intArrayOf(1, 1, 2, 2, 0, 1, 1)
      )
    }
  }
}