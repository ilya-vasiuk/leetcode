package by.ivasiuk.leetcode

/**
 * @see <a href="https://leetcode.com/problems/first-unique-character-in-a-string/">
 *   First Unique Character in a String</a>
 */
class FirstUniqueCharacterInAString {
  fun firstUniqChar(s: String): Int {
    val count = IntArray(26) { 0 }

    for (i in s.indices) {
      count[s[i].minus('a')]++
    }

    for (i in s.indices) {
      if (count[s[i].minus('a')] == 1) {
        return i
      }
    }

    return -1
  }
}