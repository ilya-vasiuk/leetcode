package by.ivasiuk.leetcode

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


  internal class UnionFind(size: Int) {
    private val parent = IntArray(size) { it }
    private val rank = IntArray(size)

    fun find(x: Int): Int {
      if (parent[x] != x) {
        parent[x] = find(parent[x])
      }

      return parent[x]
    }

    fun unionSet(x: Int, y: Int) {
      val xSet = find(x)
      val ySet = find(y)

      when {
        xSet == ySet -> return
        rank[xSet] < rank[ySet] -> parent[xSet] = ySet
        rank[xSet] > rank[ySet] -> parent[ySet] = xSet
        else -> parent[ySet] = xSet.also { rank[it]++ }
      }
    }
  }
}
