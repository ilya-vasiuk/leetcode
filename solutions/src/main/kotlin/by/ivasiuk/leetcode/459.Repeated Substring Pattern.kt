package by.ivasiuk.leetcode

/**
 * @see <a href="https://leetcode.com/problems/repeated-substring-pattern/">
 *   Repeated Substring Pattern</a>
 */
class RepeatedSubstringPattern {
  fun repeatedSubstringPattern(s: String): Boolean =
    (s + s).substring(1, s.length * 2 - 1).contains(s)
}
