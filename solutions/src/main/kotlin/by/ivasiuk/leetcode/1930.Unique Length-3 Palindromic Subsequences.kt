package by.ivasiuk.leetcode

/**
 * @see <a href="https://leetcode.com/problems/two-sum/">Two Sum</a>
 */
class UniqueLength3PalindromicSubsequences {
  fun countPalindromicSubsequence(s: String): Int {
    val first = IntArray(26) { Integer.MAX_VALUE }
    val last = IntArray(26)
    var result = 0

    for (i in s.indices) {
      first[s[i] - 'a'] = minOf(first[s[i] - 'a'], i)
      last[s[i] - 'a'] = i
    }

    for (i in 0 until 26) {
      if (first[i] < last[i]) {
        result += s.substring(first[i] + 1, last[i]).toCharArray().distinct().count()
      }
    }

    return result
  }
}
