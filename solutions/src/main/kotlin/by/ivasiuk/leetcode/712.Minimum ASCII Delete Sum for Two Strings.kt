package by.ivasiuk.leetcode

/**
 * @see <a href="https://leetcode.com/problems/minimum-ascii-delete-sum-for-two-strings/">
 *   Minimum ASCII Delete Sum for Two Strings</a>
 */
class MinimumASCIIDeleteSumForTwoStrings {
  fun minimumDeleteSum(s1: String, s2: String): Int {
    val cache = mutableMapOf<Pair<Int, Int>, Int>()

    fun dfs(p1: Int, p2: Int): Int = cache.getOrPut(p1 to p2) {
      when {
        p1 == s1.length && p2 == s2.length -> 0
        p1 == s1.length -> s2.drop(p2).sumOf { it.code }
        p2 == s2.length -> s1.drop(p1).sumOf { it.code }
        s1[p1] == s2[p2] -> dfs(p1 + 1, p2 + 1)
        else -> minOf(s1[p1].code + dfs(p1 + 1, p2), s2[p2].code + dfs(p1, p2 + 1))
      }
    }

    return dfs(0, 0)
  }
}
