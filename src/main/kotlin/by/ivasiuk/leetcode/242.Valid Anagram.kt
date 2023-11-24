package by.ivasiuk.leetcode

/**
 * @see <a href="https://leetcode.com/problems/valid-anagram/">
 *   Valid Anagram</a>
 */
class ValidAnagram {
  fun isAnagram(s: String, t: String): Boolean {
    if (s.length != t.length) {
      return false
    }

    val count = IntArray(26) { 0 }

    for (i in s.indices) {
      count[s[i].minus('a')]++
      count[t[i].minus('a')]--
    }

    return count.all { it == 0 }
  }
}