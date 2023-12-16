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

    return with(IntArray(26)) {
      for (i in s.indices) {
        this[s[i] - 'a']++
        this[t[i] - 'a']--
      }

      all { it == 0 }
    }
  }
}
