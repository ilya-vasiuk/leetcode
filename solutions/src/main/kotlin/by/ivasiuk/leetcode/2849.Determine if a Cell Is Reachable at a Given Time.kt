package by.ivasiuk.leetcode

import kotlin.math.abs

/**
 * @see <a href="https://leetcode.com/problems/determine-if-a-cell-is-reachable-at-a-given-time/">
 *   Determine if a Cell Is Reachable at a Given Time</a>
 */
class DetermineIfACellIsReachableAtAGivenTime {
  fun isReachableAtTime(sx: Int, sy: Int, fx: Int, fy: Int, t: Int): Boolean =
    if (sx == fx && sy == fy) {
      t != 1
    } else {
      maxOf(abs(fx - sx), abs(fy - sy)) <= t
    }
}
