package by.ivasiuk.leetcode

/**
 * @see <a href="https://leetcode.com/problems/find-first-palindromic-string-in-the-array/">
 *   Find First Palindromic String in the Array</a>
 */
class FindFirstPalindromicStringInTheArray {
  fun firstPalindrome(words: Array<String>): String =
    words.firstOrNull { it.isPalindrome() } ?: ""

  private fun String.isPalindrome(): Boolean {
    for (i in 0 until this.length / 2) {
      if (this[i] != this[this.lastIndex - i]) {
        return false
      }
    }

    return true
  }
}
