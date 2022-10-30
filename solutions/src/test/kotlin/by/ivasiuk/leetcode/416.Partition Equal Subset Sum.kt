package by.ivasiuk.leetcode

import kotlin.test.Test
import kotlin.test.assertFalse
import kotlin.test.assertTrue

class PartitionEqualSubsetSumTest {
  private val solution = PartitionEqualSubsetSum()

  @Test
  fun example1() {
    assertTrue {
      solution.canPartition(
        nums = intArrayOf(1, 5, 11, 5)
      )
    }
  }

  @Test
  fun example2() {
    assertFalse {
      solution.canPartition(
        nums = intArrayOf(1, 2, 3, 5)
      )
    }
  }
}
