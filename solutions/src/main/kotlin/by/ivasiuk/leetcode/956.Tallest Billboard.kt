package by.ivasiuk.leetcode

/**
 * @see <a href="https://leetcode.com/problems/tallest-billboard/">
 *   Tallest Billboard</a>
 */
class TallestBillboard {
  fun tallestBillboard(rods: IntArray): Int {
    val cache = Array(rods.size + 1) { Array(10000) { -1 } }

    fun check(curr: Int, sumDiff: Int): Int {
      if (curr == rods.size) {
        return if (sumDiff == 0) 0 else Int.MIN_VALUE / 2
      }

      return cache[curr][sumDiff + 5000].takeIf { it != -1 } ?: run {
        val take1 = rods[curr] + check(curr + 1, sumDiff + rods[curr])
        val take2 = check(curr + 1, sumDiff - rods[curr])
        val notTake = check(curr + 1, sumDiff)

        maxOf(take1, take2, notTake).also { cache[curr][sumDiff + 5000] = it }
      }
    }

    return check(0, 0)
  }
}
