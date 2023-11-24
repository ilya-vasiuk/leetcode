package by.ivasiuk.leetcode

/**
 * @see <a href="https://leetcode.com/problems/champagne-tower/">
 *   Champagne Tower</a>
 */
class ChampagneTower {
  fun champagneTower(poured: Int, query_row: Int, query_glass: Int): Double {
    var current = listOf(poured.toDouble())

    repeat(query_row) {
      val middle = current.windowed(2).map { (a, b) ->
        maxOf(0.0, a - 1.0) / 2 + maxOf(0.0, b - 1.0) / 2
      }
      val edge = listOf(maxOf(0.0, current.first() - 1.0) / 2)

      current = edge + middle + edge
    }

    return minOf(current[query_glass], 1.0)
  }
}
