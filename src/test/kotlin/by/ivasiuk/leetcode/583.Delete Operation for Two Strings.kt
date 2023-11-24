package by.ivasiuk.leetcode

import kotlin.test.Test
import kotlin.test.assertEquals

class DeleteOperationForTwoStringsTest {
  private val solution = DeleteOperationForTwoStrings()

  @Test
  fun example1() {
    assertEquals(
      expected = 2,
      actual = solution.minDistance(
        word1 = "sea",
        word2 = "eat",
      )
    )
  }

  @Test
  fun example2() {
    assertEquals(
      expected = 4,
      actual = solution.minDistance(
        word1 = "leetcode",
        word2 = "etco",
      )
    )
  }
}
