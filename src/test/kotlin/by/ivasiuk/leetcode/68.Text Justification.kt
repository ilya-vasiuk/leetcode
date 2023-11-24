package by.ivasiuk.leetcode

import kotlin.test.Test
import kotlin.test.assertContentEquals

class TextJustificationTest {
  private val solution = TextJustification()

  @Test
  fun example1() {
    assertContentEquals(
      expected = listOf(
        "This    is    an",
        "example  of text",
        "justification.  "
      ),
      actual = solution.fullJustify(
        words = arrayOf("This", "is", "an", "example", "of", "text", "justification."),
        maxWidth = 16,
      ),
    )
  }

  @Test
  fun example2() {
    assertContentEquals(
      expected = listOf(
        "What   must   be",
        "acknowledgment  ",
        "shall be        "
      ),
      actual = solution.fullJustify(
        words = arrayOf("What", "must", "be", "acknowledgment", "shall", "be"),
        maxWidth = 16,
      ),
    )
  }

  @Test
  fun example3() {
    assertContentEquals(
      expected = listOf(
        "Science  is  what we",
        "understand      well",
        "enough to explain to",
        "a  computer.  Art is",
        "everything  else  we",
        "do                  "
      ),
      actual = solution.fullJustify(
        words = arrayOf(
          "Science", "is", "what", "we",
          "understand", "well", "enough",
          "to", "explain", "to", "a",
          "computer.", "Art", "is",
          "everything", "else", "we", "do"
        ),
        maxWidth = 20,
      ),
    )
  }
}
