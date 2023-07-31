package by.ivasiuk.leetcode

import kotlin.test.Test
import kotlin.test.assertEquals

class MinimumASCIIDeleteSumForTwoStringsTest {
  private val solution = MinimumASCIIDeleteSumForTwoStrings()

  @Test
  fun example1() {
    assertEquals(
      expected = 231,
      actual = solution.minimumDeleteSum(
        s1 = "sea",
        s2 = "eat"
      )
    )
  }

  @Test
  fun example2() {
    assertEquals(
      expected = 403,
      actual = solution.minimumDeleteSum(
        s1 = "delete",
        s2 = "leet"
      )
    )
  }
}
