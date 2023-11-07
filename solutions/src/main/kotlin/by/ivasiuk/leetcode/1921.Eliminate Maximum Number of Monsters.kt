package by.ivasiuk.leetcode

/**
 * @see <a href="https://leetcode.com/problems/eliminate-maximum-number-of-monsters/">
 *     Eliminate Maximum Number of Monsters</a>
 */
class EliminateMaximumNumberOfMonsters {
  fun eliminateMaximum(dist: IntArray, speed: IntArray): Int {
    for (i in dist.indices) {
      if (dist[i] % speed[i] > 0) {
        dist[i] += speed[i]
      }

      dist[i] = dist[i] / speed[i]
    }

    for (i in dist.sorted().indices) {
      if (i >= dist[i]) {
        return i
      }
    }

    return dist.size
  }
}
