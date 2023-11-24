package by.ivasiuk.leetcode


/**
 * @see <a href="https://leetcode.com/problems/palindrome-partitioning/">
 *   Palindrome Partitioning</a>
 */
class PalindromePartitioning {
  fun partition(s: String): List<List<String>> {
    val result = mutableListOf<List<String>>()

    check(s, mutableListOf(), result)

    return result
  }

  private fun check(s: String, current: MutableList<String>, result: MutableList<List<String>>) {
    if (s.isEmpty()) {
      result.add(current.toList())
    } else {
      for (i in 1..s.length) {
        s.substring(0, i)
          .takeIf { isPalindrome(it) }
          ?.let {
            current.add(it)
            check(s.substring(i, s.length), current, result)
            current.removeAt(current.size - 1)
          }
      }
    }
  }

  private fun isPalindrome(s: String) =
    (0 until s.length / 2)
      .all { i -> s[i] == s[s.length - i - 1] }
}
