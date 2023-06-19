package by.ivasiuk.leetcode

/**
 * @see <a href="https://leetcode.com/problems/find-the-highest-altitude/">
 *   Find the Highest Altitude</a>
 */
class FindTheHighestAltitude {
  fun largestAltitude(gain: IntArray): Int {
    var current = 0
    var max = 0

    for (change in gain) {
      current += change
      max = maxOf(max, current)
    }

    return max
  }
}
