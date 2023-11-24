package by.ivasiuk.leetcode

import java.util.*
import kotlin.math.abs

/**
 * @see <a href="https://leetcode.com/problems/path-with-minimum-effort/">
 *   Path With Minimum Effort</a>
 */
class PathWithMinimumEffort {
  fun minimumEffortPath(heights: Array<IntArray>): Int {
    val m = heights.size
    val n = heights[0].size

    fun neighbours(i: Int, j: Int) =
      directions
        .map { (di, dj) -> i + di to j + dj }
        .filter { (di, dj) -> di in 0 until m && dj in 0 until n }

    fun possible(effort: Int): Boolean {
      val stack = Stack<Pair<Int, Int>>()
      val visited = mutableSetOf<Pair<Int, Int>>()
      val start = 0 to 0

      stack.push(start)
      visited.add(start)

      while (stack.isNotEmpty()) {
        val (i, j) = stack.pop()

        if (i == m - 1 && j == n - 1) {
          return true
        }

        for ((ni, nj) in neighbours(i, j)) {
          if (abs(heights[ni][nj] - heights[i][j]) <= effort && !visited.contains(ni to nj)) {
            visited.add(ni to nj)
            stack.push(ni to nj)
          }
        }
      }

      return false
    }

    var low = 0
    var high = 1_000_000

    while (low < high) {
      val mid = (low + high) / 2

      if (!possible(mid)) {
        low = mid + 1
      } else {
        high = mid
      }
    }

    return low
  }

  companion object {
    val directions = sequenceOf(
      0 to 1,
      0 to -1,
      1 to 0,
      -1 to 0
    )
  }
}
