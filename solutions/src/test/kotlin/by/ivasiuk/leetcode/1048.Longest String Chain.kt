package by.ivasiuk.leetcode

import kotlin.test.Test
import kotlin.test.assertEquals

class LongestStringChainTest {
  private val solution = LongestStringChain()

  @Test
  fun example1() {
    assertEquals(
      expected = 4,
      actual = solution.longestStrChain(
        words = arrayOf("a", "b", "ba", "bca", "bda", "bdca")
      )
    )
  }

  @Test
  fun example2() {
    assertEquals(
      expected = 5,
      actual = solution.longestStrChain(
        words = arrayOf("xbc", "pcxbcf", "xb", "cxbc", "pcxbc")
      )
    )
  }

  @Test
  fun example3() {
    assertEquals(
      expected = 1,
      actual = solution.longestStrChain(
        words = arrayOf("abcd", "dbqca")
      )
    )
  }
}
