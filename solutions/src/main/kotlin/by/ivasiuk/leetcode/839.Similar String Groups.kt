package by.ivasiuk.leetcode

import by.ivasiuk.leetcode.common.UnionFind

/**
 * @see <a href="https://leetcode.com/problems/similar-string-groups/">
 *   Similar String Groups</a>
 */
class SimilarStringGroups {
  fun numSimilarGroups(strs: Array<String>): Int {
    val n = strs.size
    var count = 0

    with(UnionFind(n)) {
      for (i in 0 until n) {
        for (j in i + 1 until n) {
          if (isSimilar(strs[i], strs[j]) && find(i) != find(j)) {
            unionSet(i, j)
            count++
          }
        }
      }
    }

    return n - count
  }

  private fun isSimilar(a: String, b: String) =
    a.indices
      .count { a[it] != b[it] }
      .let { it == 0 || it == 2 }
}
