package by.ivasiuk.leetcode

import kotlin.test.Test
import kotlin.test.assertContentEquals

class FindAllAnagramsInAStringTest {
  private val solution = FindAllAnagramsInAString()

  @Test
  fun example1() {
    assertContentEquals(
      expected = listOf(0, 6),
      actual = solution.findAnagrams(
        s = "cbaebabacd",
        p = "abc",
      )
    )
  }

  @Test
  fun example2() {
    assertContentEquals(
      expected = listOf(0, 1, 2),
      actual = solution.findAnagrams(
        s = "abab",
        p = "ab",
      )
    )
  }
}