package by.ivasiuk.leetcode

/**
 * @see <a href="https://leetcode.com/problems/find-all-anagrams-in-a-string/">
 *   Find All Anagrams in a String</a>
 */
class FindAllAnagramsInAString {
  fun findAnagrams(s: String, p: String): List<Int> {
    val chars = mutableMapOf<Char, Int>()
    for (char in p) {
      chars[char] = 1 + (chars[char] ?: 0)
    }

    val result = mutableListOf<Int>()
    var left = 0
    var right = 0

    while (right < s.length) {
      if ((chars[s[right]] ?: 0) > 0) {
        chars[s[right]] = chars[s[right]]!! - 1
        right++

        if (right - left == p.length) {
          result.add(left)
        }
      } else if (left == right) {
        left++
        right++
      } else {
        chars[s[left]] = 1 + (chars[s[left]] ?: 0)
        left++
      }
    }

    return result
  }
}