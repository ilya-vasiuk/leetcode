package by.ivasiuk.leetcode

import kotlin.test.Test
import kotlin.test.assertEquals

class MinimumNumberOfOperationsToMakeArrayEmptyTest {
  private val solution = MinimumNumberOfOperationsToMakeArrayEmpty()

  @Test
  fun example1() {
    assertEquals(
      expected = 4,
      actual = solution.minOperations(
        nums = intArrayOf(2, 3, 3, 2, 2, 4, 2, 3, 4)
      )
    )
  }

  @Test
  fun example2() {
    assertEquals(
      expected = -1,
      actual = solution.minOperations(
        nums = intArrayOf(2,1,2,2,3,3)
      )
    )
  }
}
