package by.ivasiuk.leetcode

import kotlin.test.Test
import kotlin.test.assertEquals

class RemoveDuplicateLettersTest {
  private val solution = RemoveDuplicateLetters()

  @Test
  fun example1() {
    assertEquals(
      expected = "abc",
      actual = solution.removeDuplicateLetters(
        s = "bcabc"
      )
    )
  }

  @Test
  fun example2() {
    assertEquals(
      expected = "acdb",
      actual = solution.removeDuplicateLetters(
        s = "cbacdcbc"
      )
    )
  }
}
