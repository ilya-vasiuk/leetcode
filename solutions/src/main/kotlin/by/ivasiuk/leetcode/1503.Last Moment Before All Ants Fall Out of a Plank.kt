package by.ivasiuk.leetcode

/**
 * @see <a href="https://leetcode.com/problems/last-moment-before-all-ants-fall-out-of-a-plank/">
 *   Last Moment Before All Ants Fall Out of a Plank</a>
 */
class LastMomentBeforeAllAntsFallOutOfAPlank {
  fun getLastMoment(n: Int, left: IntArray, right: IntArray): Int =
    maxOf(
      left.maxOrNull() ?: 0,
      n - (right.minOrNull() ?: n)
    )
}
