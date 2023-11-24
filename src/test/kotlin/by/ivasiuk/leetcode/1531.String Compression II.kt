package by.ivasiuk.leetcode

import kotlin.test.Test
import kotlin.test.assertEquals

class StringCompression2Test {
  private val solution = StringCompression2()

  @Test
  fun example1() {
    val result = solution.getLengthOfOptimalCompression("aaabcccd", 2)
    assertEquals(4, result)
  }

  @Test
  fun example2() {
    val result = solution.getLengthOfOptimalCompression("aabbaa", 2)
    assertEquals(2, result)
  }

  @Test
  fun example3() {
    val result = solution.getLengthOfOptimalCompression("aaaaaaaaaaa", 0)
    assertEquals(3, result)
  }
}