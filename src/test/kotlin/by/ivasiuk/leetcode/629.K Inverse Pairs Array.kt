package by.ivasiuk.leetcode

import kotlin.test.Test
import kotlin.test.assertEquals

class KInversePairsArrayTest {
  private val solution = KInversePairsArray()

  @Test
  fun example1() {
    assertEquals(
      expected = 1,
      actual = solution.kInversePairs(
        n = 3,
        k = 0
      )
    )
  }

  @Test
  fun example2() {
    assertEquals(
      expected = 2,
      actual = solution.kInversePairs(
        n = 3,
        k = 1
      )
    )
  }
}
