package by.ivasiuk.leetcode

/**
 * @see <a href="https://leetcode.com/problems/painting-the-walls/">Painting the Walls</a>
 */
class PaintingTheWalls {
  fun paintWalls(cost: IntArray, time: IntArray): Int {
    val memo = mutableMapOf<String, Int>()

    fun check(i: Int, t: Int): Int {
      val key = "$i:$t"

      if (!memo.containsKey(key)) {
        memo[key] = if (i == cost.size) {
          if (t < 0) 1_000_000_000 else 0
        } else {
          val takePaid = cost[i] + check(i + 1, minOf(cost.size, t + time[i]))
          val takeFree = check(i + 1, t - 1)

          minOf(takePaid, takeFree)
        }
      }

      return memo[key]!!
    }

    return check(0, 0)
  }
}
