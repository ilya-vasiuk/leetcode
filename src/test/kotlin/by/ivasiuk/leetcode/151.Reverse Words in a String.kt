package by.ivasiuk.leetcode

import kotlin.test.Test
import kotlin.test.assertEquals

class ReverseWordsInAStringTest {
  private val solution = ReverseWordsInAString()

  @Test
  fun example1() {
    assertEquals(
      expected = "blue is sky the",
      actual = solution.reverseWords(
        s = "the sky is blue"
      )
    )
  }

  @Test
  fun example2() {
    assertEquals(
      expected = "world hello",
      actual = solution.reverseWords(
        s = "  hello world  "
      )
    )
  }
}
