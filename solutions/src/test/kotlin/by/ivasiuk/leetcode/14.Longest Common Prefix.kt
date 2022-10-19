package by.ivasiuk.leetcode

import kotlin.test.Test
import kotlin.test.assertEquals

class LongestCommonPrefixTest {
  private val solution = LongestCommonPrefix()

  @Test
  fun example1() {
    val result = solution.longestCommonPrefix(
      arrayOf(
        "flower",
        "flow",
        "flight",
      )
    )

    assertEquals("fl", result)
  }

  @Test
  fun example2() {
    val result = solution.longestCommonPrefix(
      arrayOf(
        "dog",
        "racecar",
        "car",
      )
    )

    assertEquals("", result)
  }
}