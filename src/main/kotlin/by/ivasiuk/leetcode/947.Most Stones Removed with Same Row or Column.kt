package by.ivasiuk.leetcode

/**
 * @see <a href="https://leetcode.com/problems/most-stones-removed-with-same-row-or-column/">
 *   Most Stones Removed with Same Row or Column</a>
 */
class MostStonesRemovedWithSameRowOrColumn {
  fun removeStones(stones: Array<IntArray>): Int {
    val visited = mutableSetOf<IntArray>()
    var unions = 0

    for (stone in stones) {
      if (!visited.contains(stone)) {
        check(stones, stone, visited)
        unions++
      }
    }

    return stones.size - unions
  }

  private fun check(
    stones: Array<IntArray>,
    prev: IntArray,
    visited: MutableSet<IntArray>,
  ) {
    visited.add(prev)
    for (curr in stones) {
      if (!visited.contains(curr)) {
        if (prev[0] == curr[0] || prev[1] == curr[1]) {
          check(stones, curr, visited)
        }
      }
    }
  }
}