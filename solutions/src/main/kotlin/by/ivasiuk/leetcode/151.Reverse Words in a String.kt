package by.ivasiuk.leetcode

/**
 * @see <a href="https://leetcode.com/problems/reverse-words-in-a-string/">
 *   Reverse Words in a String</a>
 */
class ReverseWordsInAString {
  fun reverseWords(s: String): String =
    s.trim().split(Regex("\\s+")).reversed().joinToString(" ")
}
