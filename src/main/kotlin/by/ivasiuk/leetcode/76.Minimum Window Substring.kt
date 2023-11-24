package by.ivasiuk.leetcode

/**
 * @see <a href="https://leetcode.com/problems/odd-even-linked-list/">
 *   Minimum Window Substring</a>
 */
//TODO: Leetcode Solution
class MinimumWindowSubstring {
  fun minWindow(s: String, t: String): String {
    if (s.isEmpty() || t.isEmpty()) {
      return ""
    }

    val memo = mutableMapOf<Char, Int>()

    for (i in t.indices) {
      memo[t[i]] = 1 + (memo[t[i]] ?: 0)
    }

    val required = memo.size

    val filteredS = mutableListOf<Pair<Int, Char>>()
    for (i in s.indices) {
      val c = s[i]
      if (memo.containsKey(c)) {
        filteredS.add(Pair(i, c))
      }
    }

    var l = 0
    var r = 0
    var formed = 0
    val windowCounts = mutableMapOf<Char, Int>()
    val ans = intArrayOf(-1, 0, 0)

    while (r < filteredS.size) {
      var c = filteredS[r].second

      windowCounts[c] = 1 + (windowCounts[c] ?: 0)
      if (memo.containsKey(c) && windowCounts[c] == memo[c]) {
        formed++
      }

      while (l <= r && formed == required) {
        c = filteredS[l].second

        val end: Int = filteredS[r].first
        val start: Int = filteredS[l].first
        if (ans[0] == -1 || end - start + 1 < ans[0]) {
          ans[0] = end - start + 1
          ans[1] = start
          ans[2] = end
        }

        windowCounts[c] = windowCounts[c]!! - 1

        if (memo.containsKey(c) && windowCounts[c]!! < memo[c]!!) {
          formed--
        }

        l++
      }

      r++
    }

    return if (ans[0] == -1) "" else s.substring(ans[1], ans[2] + 1)
  }
}