package by.ivasiuk.leetcode

import kotlin.test.Test
import kotlin.test.assertEquals

class LongestArithmeticSubsequenceTest {
  private val solution = LongestArithmeticSubsequence()

  @Test
  fun example1() {
    assertEquals(
      expected = 4,
      actual = solution.solution(
        nums = intArrayOf(3, 6, 9, 12)
      )
    )
  }

  @Test
  fun example2() {
    assertEquals(
      expected = 3,
      actual = solution.solution(
        nums = intArrayOf(9, 4, 7, 2, 10)
      )
    )
  }

  @Test
  fun example3() {
    assertEquals(
      expected = 4,
      actual = solution.solution(
        nums = intArrayOf(20, 1, 15, 3, 10, 5, 8)
      )
    )
  }
}
