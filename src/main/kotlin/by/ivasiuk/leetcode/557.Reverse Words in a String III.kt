package by.ivasiuk.leetcode

/**
 * @see <a href="https://leetcode.com/problems/reverse-words-in-a-string-iii/">
 *   Reverse Words in a String III</a>
 */
class ReverseWordsInAString3 {
  fun reverseWords(s: String): String =
    s.split(" ").joinToString(" ") { it.reversed() }
}
