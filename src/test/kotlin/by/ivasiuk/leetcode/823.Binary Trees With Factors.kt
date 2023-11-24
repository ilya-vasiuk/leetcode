package by.ivasiuk.leetcode

import kotlin.test.Test
import kotlin.test.assertEquals

class BinaryTreesWithFactorsTest {
  private val solution = BinaryTreesWithFactors()

  @Test
  fun example1() {
    assertEquals(
      expected = 3,
      actual = solution.numFactoredBinaryTrees(
        arr = intArrayOf(2, 4)
      )
    )
  }

  @Test
  fun example2() {
    assertEquals(
      expected = 7,
      actual = solution.numFactoredBinaryTrees(
        arr = intArrayOf(2, 4, 5, 10)
      )
    )
  }
}
