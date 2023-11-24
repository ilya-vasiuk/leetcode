package by.ivasiuk.leetcode

import by.ivasiuk.leetcode.common.UnionFind


/**
 * @see <a href="https://leetcode.com/problems/checking-existence-of-edge-length-limited-paths/">
 *   Checking Existence of Edge Length Limited Paths</a>
 */
class CheckingExistenceOfEdgeLengthLimitedPaths {
  fun distanceLimitedPathsExist(n: Int, edgeList: Array<IntArray>, queries: Array<IntArray>): BooleanArray {
    val queriesCount = queries.size
    val result = BooleanArray(queriesCount)

    val queriesWithIndex = Array(queriesCount) { i ->
      intArrayOf(queries[i][0], queries[i][1], queries[i][2], i)
    }

    edgeList.sortBy { it[2] }
    queriesWithIndex.sortBy { it[2] }

    var current = 0

    with(UnionFind(n)) {
      for (queryIndex in 0 until queriesCount) {
        val (p, q, limit, index) = queriesWithIndex[queryIndex]

        while (current < edgeList.size && edgeList[current][2] < limit) {
          unionSet(edgeList[current][0], edgeList[current][1])
          current += 1
        }

        result[index] = find(p) == find(q)
      }
    }

    return result
  }
}
