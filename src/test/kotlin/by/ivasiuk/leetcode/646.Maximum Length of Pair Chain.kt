package by.ivasiuk.leetcode

import kotlin.test.Test
import kotlin.test.assertEquals

class MaximumLengthOfPairChainTest {
  private val solution = MaximumLengthOfPairChain()

  @Test
  fun example1() {
    assertEquals(
      expected = 2,
      actual = solution.findLongestChain(
        pairs = arrayOf(
          intArrayOf(1, 2),
          intArrayOf(2, 3),
          intArrayOf(3, 4),
        )
      )
    )
  }

  @Test
  fun example2() {
    assertEquals(
      expected = 3,
      actual = solution.findLongestChain(
        pairs = arrayOf(
          intArrayOf(1, 2),
          intArrayOf(7, 8),
          intArrayOf(4, 5),
        )
      )
    )
  }
}
