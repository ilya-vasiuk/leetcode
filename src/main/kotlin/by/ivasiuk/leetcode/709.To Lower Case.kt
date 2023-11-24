package by.ivasiuk.leetcode

/**
 * @see <a href="https://leetcode.com/problems/to-lower-case/">To Lower Case</a>
 */
class ToLowerCase {
  fun toLowerCase(s: String): String =
    s.map { if(it in 'A'..'Z') it + 32 else it }.joinToString("")
}
