package by.ivasiuk.leetcode

import kotlin.test.Test
import kotlin.test.assertFalse
import kotlin.test.assertTrue

class ContinuousSubarraySumTest {
  private val solution = ContinuousSubarraySum()

  @Test
  fun example1() {
    assertTrue {
      solution.checkSubarraySum(intArrayOf(23, 2, 4, 6, 7), 6)
    }
  }

  @Test
  fun example2() {
    assertTrue {
      solution.checkSubarraySum(intArrayOf(23, 2, 6, 4, 7), 6)
    }
  }

  @Test
  fun example3() {
    assertFalse {
      solution.checkSubarraySum(intArrayOf(23, 2, 6, 4, 7), 13)
    }
  }
}