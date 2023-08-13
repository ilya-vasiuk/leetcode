package by.ivasiuk.leetcode

import kotlin.test.Test
import kotlin.test.assertFalse
import kotlin.test.assertTrue

class CheckIfThereIsAValidPartitionForTheArrayTest {
  private val solution = CheckIfThereIsAValidPartitionForTheArray()

  @Test
  fun example1() {
    assertTrue {
      solution.validPartition(
        nums = intArrayOf(4, 4, 4, 5, 6)
      )
    }
  }

  @Test
  fun example2() {
    assertFalse {
      solution.validPartition(
        nums = intArrayOf(1, 1, 1, 2)
      )
    }
  }

  @Test
  fun example3() {
    assertTrue {
      solution.validPartition(
        nums = intArrayOf(803201, 803201, 803201, 803201, 803202, 803203)
      )
    }
  }
}
