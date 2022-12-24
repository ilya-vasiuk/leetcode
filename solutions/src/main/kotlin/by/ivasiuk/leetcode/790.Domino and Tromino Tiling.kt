package by.ivasiuk.leetcode

import java.util.LinkedList

/**
 * @see <a href="https://leetcode.com/problems/domino-and-tromino-tiling/">
 *   Domino and Tromino Tiling</a>
 */
class DominoAndTrominoTiling {
  fun numTilings(n: Int): Int {
    if (n < 3) {
      return n
    }

    val modulo = 1000_000_007
    val memo = LinkedList<Long>().also {
      it.offer(1)
      it.offer(2)
      it.offer(5)
    }

    for (i in 4..n) {
      memo.offer((2 * memo.last + memo.first).rem(modulo))
      memo.pollFirst()
    }

    return memo.last.toInt()
  }
}
