package by.ivasiuk.leetcode

import kotlin.test.Test
import kotlin.test.assertFalse
import kotlin.test.assertTrue

class Pattern132Test {
  private val solution = Pattern132()

  @Test
  fun example1() {
    assertFalse {
      solution.find132pattern(
        nums = intArrayOf(1, 2, 3, 4)
      )
    }
  }

  @Test
  fun example2() {
    assertTrue {
      solution.find132pattern(
        nums = intArrayOf(3, 1, 4, 2)
      )
    }
  }

  @Test
  fun example3() {
    assertTrue {
      solution.find132pattern(
        nums = intArrayOf(-1, 3, 2, 0)
      )
    }
  }
}
