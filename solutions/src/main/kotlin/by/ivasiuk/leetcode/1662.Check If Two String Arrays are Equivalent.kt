package by.ivasiuk.leetcode

/**
 * @see <a href="https://leetcode.com/problems/check-if-two-string-arrays-are-equivalent/">
 *   Check If Two String Arrays are Equivalent</a>
 */
class CheckIfTwoStringArraysAreEquivalent {
  fun arrayStringsAreEqual(word1: Array<String>, word2: Array<String>): Boolean =
    word1.joinToString("") == word2.joinToString("")
}