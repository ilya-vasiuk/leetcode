package by.ivasiuk.leetcode

import kotlin.test.Test
import kotlin.test.assertEquals

class PartitionArrayForMaximumSumTest {
  private val solution = PartitionArrayForMaximumSum()

  @Test
  fun example1() {
    assertEquals(
      expected = 84,
      actual = solution.maxSumAfterPartitioning(
        arr = intArrayOf(1, 15, 7, 9, 2, 5, 10),
        k = 3,
      )
    )
  }

  @Test
  fun example2() {
    assertEquals(
      expected = 83,
      actual = solution.maxSumAfterPartitioning(
        arr = intArrayOf(1, 4, 1, 5, 7, 3, 6, 1, 9, 9, 3),
        k = 4,
      )
    )
  }

  @Test
  fun example3() {
    assertEquals(
      expected = 1,
      actual = solution.maxSumAfterPartitioning(
        arr = intArrayOf(1),
        k = 1,
      )
    )
  }
}
