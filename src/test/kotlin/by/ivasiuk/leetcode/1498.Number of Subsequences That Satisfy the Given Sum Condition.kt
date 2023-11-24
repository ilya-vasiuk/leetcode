package by.ivasiuk.leetcode

import kotlin.test.Test
import kotlin.test.assertEquals

class NumberOfSubsequencesThatSatisfyTheGivenSumConditionTest {
  private val solution = NumberOfSubsequencesThatSatisfyTheGivenSumCondition()

  @Test
  fun example1() {
    assertEquals(
      expected = 4,
      actual = solution.numSubseq(
        nums = intArrayOf(3, 5, 6, 7),
        target = 9
      )
    )
  }

  @Test
  fun example2() {
    assertEquals(
      expected = 6,
      actual = solution.numSubseq(
        nums = intArrayOf(3, 3, 6, 8),
        target = 10
      )
    )
  }

  @Test
  fun example3() {
    assertEquals(
      expected = 61,
      actual = solution.numSubseq(
        nums = intArrayOf(2, 3, 3, 4, 6, 7),
        target = 12
      )
    )
  }
}
