package by.ivasiuk.leetcode

import kotlin.test.Test
import kotlin.test.assertFalse
import kotlin.test.assertTrue

class MonotonicArrayTest {
  private val solution = MonotonicArray()

  @Test
  fun example1() {
    assertTrue {
      solution.isMonotonic(
        nums = intArrayOf(1, 2, 2, 3)
      )
    }
  }

  @Test
  fun example2() {
    assertTrue {
      solution.isMonotonic(
        nums = intArrayOf(6, 5, 4, 4)
      )
    }
  }

  @Test
  fun example3() {
    assertFalse {
      solution.isMonotonic(
        nums = intArrayOf(1, 3, 2)
      )
    }
  }
}
