package by.ivasiuk.leetcode

/**
 * @see <a href="https://leetcode.com/problems/pacific-atlantic-water-flow/">
 *   Pacific Atlantic Water Flow</a>
 */
class PacificAtlanticWaterFlow {
  fun pacificAtlantic(heights: Array<IntArray>): List<List<Int>> {
    val m = heights.size
    val n = heights[0].size
    val pacific = Array(m) { BooleanArray(n) { false } }
    val atlantic = Array(m) { BooleanArray(n) { false } }

    for (i in 0 until m) {
      check(i, 0, m, n, pacific, heights[i][0], heights)
      check(i, n - 1, m, n, atlantic, heights[i][n - 1], heights)
    }
    for (j in 0 until n) {
      check(0, j, m, n, pacific, heights[0][j], heights)
      check(m - 1, j, m, n, atlantic, heights[m - 1][j], heights)
    }

    val result = mutableListOf<List<Int>>()
    for (i in 0 until m) {
      for (j in 0 until n) {
        if (atlantic[i][j] && pacific[i][j]) {
          result.add(listOf(i, j))
        }
      }
    }

    return result
  }

  private fun check(
    i: Int,
    j: Int,
    m: Int,
    n: Int,
    ocean: Array<BooleanArray>,
    prevHeight: Int,
    heights: Array<IntArray>
  ) {
    if (
      i in 0 until m &&
      j in 0 until n &&
      !ocean[i][j] &&
      prevHeight <= heights[i][j]
    ) {
      ocean[i][j] = true
      check(i + 1, j, m, n, ocean, heights[i][j], heights)
      check(i - 1, j, m, n, ocean, heights[i][j], heights)
      check(i, j + 1, m, n, ocean, heights[i][j], heights)
      check(i, j - 1, m, n, ocean, heights[i][j], heights)
    }
  }
}