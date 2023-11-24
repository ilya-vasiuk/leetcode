package by.ivasiuk.leetcode

import kotlin.test.Test
import kotlin.test.assertEquals

class ReductionOperationsToMakeTheArrayElementsEqualTest {
  private val solution = ReductionOperationsToMakeTheArrayElementsEqual()

  @Test
  fun example1() {
    assertEquals(
      expected = 3,
      actual = solution.reductionOperations(
        nums = intArrayOf(5, 1, 3)
      )
    )
  }

  @Test
  fun example2() {
    assertEquals(
      expected = 0,
      actual = solution.reductionOperations(
        nums = intArrayOf(1, 1, 1)
      )
    )
  }

  @Test
  fun example3() {
    assertEquals(
      expected = 4,
      actual = solution.reductionOperations(
        nums = intArrayOf(1, 1, 2, 2, 3)
      )
    )
  }
}
