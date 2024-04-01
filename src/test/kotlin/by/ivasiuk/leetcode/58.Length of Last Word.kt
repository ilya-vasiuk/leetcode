package by.ivasiuk.leetcode

import kotlin.test.Test
import kotlin.test.assertEquals

class LengthOfLastWordTest {
  private val solution = LengthOfLastWord()

  @Test
  fun example1() {
    assertEquals(
      expected = 5,
      actual = solution.lengthOfLastWord(
        s = "Hello World",
      )
    )
  }

  @Test
  fun example2() {
    assertEquals(
      expected = 4,
      actual = solution.lengthOfLastWord(
        s = "   fly me   to   the moon  ",
      )
    )
  }

  @Test
  fun example3() {
    assertEquals(
      expected = 6,
      actual = solution.lengthOfLastWord(
        s = "luffy is still joyboy",
      )
    )
  }
}
