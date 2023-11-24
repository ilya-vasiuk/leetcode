package by.ivasiuk.leetcode

import kotlin.test.Test
import kotlin.test.assertEquals

class MergeStringsAlternatelyTest {
  private val solution = MergeStringsAlternately()

  @Test
  fun example1() {
    assertEquals(
      expected = "apbqcr",
      actual = solution.mergeAlternately(
        word1 = "abc",
        word2 = "pqr",
      )
    )
  }

  @Test
  fun example2() {
    assertEquals(
      expected = "apbqrs",
      actual = solution.mergeAlternately(
        word1 = "ab",
        word2 = "pqrs",
      )
    )
  }

  @Test
  fun example3() {
    assertEquals(
      expected = "apbqcd",
      actual = solution.mergeAlternately(
        word1 = "abcd",
        word2 = "pq",
      )
    )
  }
}
