package by.ivasiuk.leetcode

/**
 * @see <a href="https://leetcode.com/problems/knight-dialer/">
 *   Knight Dialer</a>
 */
class KnightDialer {
  val memo = mutableMapOf<Pair<Int, Int>, Int>()

  fun knightDialer(pos: Int, prev: Int = -1): Int =
    if (pos == 0) {
      1
    } else {
      memo.getOrPut(pos to prev) {
        PATHS[prev]!!.map { knightDialer(pos - 1, it) }
          .fold(0) { r, t -> (r + t) % MODULO }
      }
    }

  companion object {
    val PATHS = mapOf(
      -1 to listOf(1, 2, 3, 4, 5, 6, 7, 8, 9, 0),
      0 to listOf(4, 6),
      1 to listOf(6, 8),
      2 to listOf(7, 9),
      3 to listOf(4, 8),
      4 to listOf(3, 9, 0),
      5 to listOf(),
      6 to listOf(1, 7, 0),
      7 to listOf(2, 6),
      8 to listOf(1, 3),
      9 to listOf(2, 4)
    )

    const val MODULO = 1_000_000_007
  }
}
