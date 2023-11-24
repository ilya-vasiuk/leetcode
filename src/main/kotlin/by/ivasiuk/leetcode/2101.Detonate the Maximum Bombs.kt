package by.ivasiuk.leetcode

/**
 * @see <a href="https://leetcode.com/problems/detonate-the-maximum-bombs/">
 *   Detonate the Maximum Bombs</a>
 */
class DetonateTheMaximumBombs {
  fun maximumDetonation(bombs: Array<IntArray>): Int {
    fun check(idx: Int, visited: BooleanArray = BooleanArray(bombs.size)): Int {
      visited[idx] = true

      return 1 + bombs.indices.map {
        if (!visited[it] && inRange(bombs[idx], bombs[it])) {
          check(it, visited)
        } else 0
      }.sum()
    }

    return bombs.indices
      .map { check(it) }
      .max()
  }

  private fun inRange(a: IntArray, b: IntArray): Boolean {
    val dx = (a[0] - b[0]).toLong()
    val dy = (a[1] - b[1]).toLong()
    val r = a[2].toLong()

    return dx * dx + dy * dy <= r * r
  }
}
